package br.com.hexabet.api.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_bets")
public class Bet {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String guess;
  private Date createdAt;
  private Date updatedAt;

  public Bet() {
  }

  public Bet(Long id, String guess, Date createdAt, Date updatedAt) {
    this.id = id;
    this.guess = guess;
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

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
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
