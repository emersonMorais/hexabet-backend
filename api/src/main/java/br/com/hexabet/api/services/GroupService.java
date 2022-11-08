package br.com.hexabet.api.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.hexabet.api.dto.GroupDTO;

import br.com.hexabet.api.entities.Group;
import br.com.hexabet.api.repositories.GroupRepository;

@Service
public class GroupService {

  @Autowired
  private GroupRepository groupRepository;

  @Transactional
  public Page<GroupDTO> findAllBetsPaged(PageRequest pageRequest) {
    Page<Group> listOfGroups = groupRepository.findAll(pageRequest);
    return listOfGroups.map(group -> (new GroupDTO(group)));
  }

  @Transactional
  public GroupDTO findBetById(Long id) {
    Optional<Group> groupOptional = groupRepository.findById(id);
    Group group = groupOptional.get();
    return new GroupDTO(group);
  }

  @Transactional
  public GroupDTO insertNewBet(GroupDTO groupDTO) {
    Group group = new Group();
    group.setName(groupDTO.getName());
    group = groupRepository.save(group);
    return new GroupDTO(group);
  }

  @Transactional
  public GroupDTO updateGroup(Long id, GroupDTO groupDTO) {
    try {
      Group group = groupRepository.getReferenceById(id);
      group.setName(groupDTO.getName());
      group = groupRepository.save(group);
      return new GroupDTO(group);
    } catch (EntityNotFoundException e) {
      throw new RuntimeException(e.getMessage());
    }
  }

}