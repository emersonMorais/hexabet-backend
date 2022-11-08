package br.com.hexabet.api.dto;

import br.com.hexabet.api.entities.Bet;
import br.com.hexabet.api.entities.Match;
import br.com.hexabet.api.entities.User;
import br.com.hexabet.api.enums.BetStatusEnum;

public class BetDTO {
  private Long id;
  private BetStatusEnum guess;
  private Match matchId;
  private User userId;

  public BetDTO() {
  }

  public BetDTO(Long id, BetStatusEnum guess, Match matchId, User userId) {
    this.id = id;
    this.guess = guess;
    this.matchId = matchId;
    this.userId = userId;
  }

  public BetDTO(Bet entityBet) {
    this.id = entityBet.getId();
    this.matchId = entityBet.getMatchId();
    this.userId = entityBet.getUserId();
    this.guess = entityBet.getGuess();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Match getMatchId() {
    return matchId;
  }

  public void setMatchId(Match matchId) {
    this.matchId = matchId;
  }

  public User getUserId() {
    return userId;
  }

  public void setUserId(User userId) {
    this.userId = userId;
  }

  public BetStatusEnum getGuess() {
    return guess;
  }

  public void setGuess(BetStatusEnum guess) {
    this.guess = guess;
  }

}
