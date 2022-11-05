package br.com.hexabet.api.dto;

import br.com.hexabet.api.entities.Bet;

public class BetDTO {
  private Long id;
  private String guess;

  public BetDTO() {
  }

  public BetDTO(Long id, String guess) {
    this.id = id;
    this.guess = guess;
  }

  public BetDTO(Bet entityBet ) {
    this.id = entityBet.getId();
    this.guess = entityBet.getGuess();
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

}
