package br.com.hexabet.api.entities;

import java.time.OffsetDateTime;
import java.util.Objects;

public class Bet {
  private Long id;
  private String guess;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;

  public Bet() {
  }

  public Bet(Long id, String guess, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
    this.id = id;
    this.guess = guess;
    this.createdAt = createdAt;
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
