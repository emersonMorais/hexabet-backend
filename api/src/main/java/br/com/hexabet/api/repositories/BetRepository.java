package br.com.hexabet.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hexabet.api.entities.Bet;

public interface BetRepository extends JpaRepository<Bet, Long> {}


