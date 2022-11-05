package br.com.hexabet.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hexabet.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByEmail(String email);
}
