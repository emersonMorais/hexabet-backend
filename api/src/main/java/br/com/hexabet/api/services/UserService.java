package br.com.hexabet.api.services;


import java.time.Instant;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.hexabet.api.dto.RoleDTO;
import br.com.hexabet.api.dto.UserDTO;
import br.com.hexabet.api.dto.UserInsertPasswordDTO;
import br.com.hexabet.api.entities.Role;
import br.com.hexabet.api.entities.User;
import br.com.hexabet.api.repositories.RoleRepository;
import br.com.hexabet.api.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {

  @Autowired
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RoleRepository roleRepository;

  @Transactional
  public Page<UserDTO> findAllUsersPaged(PageRequest pageRequest) {
    Page<User> listOfUsers = userRepository.findAll(pageRequest);
    return listOfUsers.map(user -> new UserDTO(user));
  }

  @Transactional
  public UserDTO findUserById(Long id) {
    Optional<User> userOptional = userRepository.findById(id);
    User user = userOptional.get();

    return new UserDTO(user);
  }

  @Transactional
  public UserDTO insertNewUser(UserInsertPasswordDTO userDTO) {
    User user = new User();
    passDtoToEntity(userDTO, user);

    user.setPassword(bCryptPasswordEncoder
        .encode(userDTO.getPassword()));

    user = userRepository.save(user);
    return new UserDTO(user);
  }

  @Transactional
  public UserDTO updateUser(Long id, UserDTO userDTO) {
    try {
      User user = userRepository.getReferenceById(id);
      user.setFirstName(userDTO.getFirstName());
      user.setLastName(userDTO.getLastName());
      user.setUpdatedAt(Instant.now());
      user = userRepository.save(user);
      return new UserDTO(user);
    } catch (EntityNotFoundException e) {
      throw new RuntimeException(e.getMessage());
    }

  }
  public void deleteUser(Long id) {
    try {
      userRepository.deleteById(id);
    } catch (EmptyResultDataAccessException err) {
      err.printStackTrace();
    }
  }

  private void passDtoToEntity(UserDTO userDTO, User user) {

    user.setFirstName((userDTO.getFirstName()));
    user.setLastName((userDTO.getLastName()));
    user.setEmail((userDTO.getEmail()));
    user.setCreatedAt((Instant.now()));
    user.setUpdatedAt(Instant.now());
    user.getRoles().clear();

    for (RoleDTO roleDTO : userDTO.getRoles()) {
      Role role = roleRepository.getReferenceById(roleDTO.getId());
      user.getRoles().add(role);
    }

  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByEmail(username);

    if(user == null) {
      throw new UsernameNotFoundException("Email n??o encontrado");
    }
    return user;
  }
}
