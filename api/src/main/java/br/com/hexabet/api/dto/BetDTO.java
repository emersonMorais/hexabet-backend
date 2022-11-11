package br.com.hexabet.api.dto;

import br.com.hexabet.api.entities.Bet;
import br.com.hexabet.api.enums.BetStatusEnum;

import java.time.Instant;

public class BetDTO {
  private Long id;
  private BetStatusEnum guess;
  private Long matchId;
  private Long userId;

  private Instant createdAt;

  private Instant updatedAt;

  public BetDTO() {
  }

  public BetDTO(Long id, BetStatusEnum guess, Long matchId, Long userId, Instant createdAt, Instant updatedAt) {
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.guess = guess;
    this.matchId = matchId;
    this.userId = userId;
  }

  public BetDTO(Bet entityBet) {
    this.id = entityBet.getId();
    this.createdAt = entityBet.getCreatedAt();
    this.updatedAt = entityBet.getCreatedAt();
    this.guess = entityBet.getGuess();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getMatchId() {
    return matchId;
  }

  public void setMatchId(Long matchId) {
    this.matchId = matchId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public BetStatusEnum getGuess() {
    return guess;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }
}
