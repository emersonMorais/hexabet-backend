package br.com.hexabet.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hexabet.api.entities.Match;


@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {}
