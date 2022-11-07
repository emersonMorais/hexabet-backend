package br.com.hexabet.api.entities;

import java.time.Instant;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_bets")
public class Bet {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String guess;
  private Instant createdAt;
  private Instant updatedAt;

  
  @ManyToOne
  @JoinColumn(name = "match_id")
  private Match matchId;
  
  
  public Bet() {
  }


  public Bet(Long id, String guess, Match matchId, Instant createdAt, Instant updatedAt) {
    this.id = id;
    this.guess = guess;
    this.matchId = matchId;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
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


 
}
