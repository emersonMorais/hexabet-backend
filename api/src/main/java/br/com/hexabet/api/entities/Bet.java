package br.com.hexabet.api.entities;

import java.time.Instant;
import java.util.Objects;

import javax.persistence.*;

import br.com.hexabet.api.dto.BetDTO;
import br.com.hexabet.api.enums.BetStatusEnum;

@Entity
@Table(name = "tb_bets")
public class Bet {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Instant createdAt;
  private Instant updatedAt;
  @Enumerated(EnumType.STRING)
  private BetStatusEnum guess;

  @ManyToOne
  @JoinColumn(name = "match_id")
  private Match matchId;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User userId;

  public Bet() {
  }

  public Bet(Long id, Instant createdAt, Instant updatedAt, BetStatusEnum guess, Match matchId, User userId) {
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.guess = guess;
    this.matchId = matchId;
    this.userId = userId;
  }

  public Bet(BetDTO betDTO, Match matchId, User userId) {
    this.guess = betDTO.getGuess();
    this.matchId = matchId;
    this.userId = userId;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public Match getMatchId() {
    return matchId;
  }

  public void setMatchId(Match matchId) {
    this.matchId = matchId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public User getUserId() {
    return userId;
  }

  public void setUserId(User userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Bet))
      return false;
    Bet other = (Bet) obj;
    return Objects.equals(id, other.id);
  }

  @Override
  public String toString() {
    return "Bet [id=" + id + ", guess=" + guess + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
  }

  public BetStatusEnum getGuess() {
    return guess;
  }

  public void setGuess(BetStatusEnum guess) {
    this.guess = guess;
  }
}
