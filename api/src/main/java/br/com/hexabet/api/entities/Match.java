package br.com.hexabet.api.entities;

import java.time.Instant;

import java.util.Objects;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import br.com.hexabet.api.enums.BetStatusEnum;

@Entity
@Table(name = "tb_matches")
public class Match {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "match_id")
  private Long id;

  private Boolean isActive;

  @Enumerated(EnumType.STRING)
  private BetStatusEnum result;

  @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
  private Instant date;

  @ManyToOne
  @JoinColumn(name = "team1_id")
  private Team firstTeam;

  @ManyToOne
  @JoinColumn(name = "team2_id")
  private Team secondTeam;


  public Match() {
  }

  public Match(Long id, BetStatusEnum result, Instant date, Team firstTeam, Team secondTeam, Boolean isActive) {
    this.id = id;
    this.result = result;
    this.date = date;
    this.firstTeam = firstTeam;
    this.secondTeam = secondTeam;
    this.isActive = isActive;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;

  }

  public Team getFirstTeam() {
    return firstTeam;
  }

  public void setFirstTeam(Team firstTeam) {
    this.firstTeam = firstTeam;
  }

  public Team getSecondTeam() {
    return secondTeam;
  }

  public void setSecondTeam(Team secondTeam) {
    this.secondTeam = secondTeam;
  }

  public Instant getDate() {
    return date;
  }

  public void setDate(Instant date) {
    this.date = date;
  }


  public BetStatusEnum getResult() {
    return result;
  }

  public void setResult(BetStatusEnum result) {
    this.result = result;
  }

  public Boolean getisActive() {
    return isActive;
  }

  public void setActive(Boolean active) {
    isActive = active;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Match))
      return false;
    Match other = (Match) obj;
    return Objects.equals(id, other.id);
  }

  @Override
  public String toString() {
    return "Match [id=" + id + ", date=" + date + ", firstTeam=" + firstTeam + ", secondTeam="
        + secondTeam
        + "]";
  }

}
