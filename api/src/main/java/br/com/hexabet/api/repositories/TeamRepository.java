package br.com.hexabet.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.com.hexabet.api.entities.Team;


@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {}
