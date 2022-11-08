package br.com.hexabet.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hexabet.api.entities.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {}


