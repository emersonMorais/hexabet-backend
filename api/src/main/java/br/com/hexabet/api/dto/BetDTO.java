package br.com.hexabet.api.dto;

import br.com.hexabet.api.entities.Bet;
import br.com.hexabet.api.entities.Match;
import br.com.hexabet.api.entities.User;

public class BetDTO {
  private Long id;
  private String guess;

  private Match matchId;
  private User userId;

  public BetDTO() {
  }

  public BetDTO(Long id, String guess, Match matchID, User userId) {
    this.id = id;
    this.guess = guess;
    this.matchId = matchID;
    this.userId = userId;
  }

  public BetDTO(Bet entityBet) {
    this.id = entityBet.getId();
    this.guess = entityBet.getGuess();
    this.matchId = entityBet.getMatchId();
    this.userId = entityBet.getUserId();
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

}
