package br.com.hexabet.api.dto;

import java.util.HashSet;
import java.util.Set;

import br.com.hexabet.api.entities.Bet;
import br.com.hexabet.api.entities.Match;

public class BetDTO {
  private Long id;
  private String guess;

  private Set<Match> matches = new HashSet<>();

  public BetDTO() {
  }

  public BetDTO(Long id, String guess) {
    this.id = id;
    this.guess = guess;
  }

  public BetDTO(Bet entityBet) {
    this.id = entityBet.getId();
    this.guess = entityBet.getGuess();
  }

  public BetDTO(Bet entityBet, Set<Match> matches) {
    this(entityBet);
    matches.forEach(match -> this.matches.add(match));
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getGuess() {
    return guess;
  }

  public void setGuess(String guess) {
    this.guess = guess;
  }

  public Set<Match> getMatches() {
    return matches;
  }

}
