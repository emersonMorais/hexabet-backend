package br.com.hexabet.api.dto;

import java.time.Instant;

import br.com.hexabet.api.entities.Match;
import br.com.hexabet.api.entities.Team;
import br.com.hexabet.api.enums.BetStatusEnum;

public class MatchDTO {
  private Long id;
  private Instant date;

  private BetStatusEnum result;

  private Team firstTeam;
  private Team secondTeam;

  private Boolean isActive;

  public MatchDTO() {
  }

  public MatchDTO(Long id, Instant date, BetStatusEnum result, Team firstTeam, Team secondTeam, Boolean isActive) {
    this.id = id;
    this.date = date;
    this.result = result;
    this.firstTeam = firstTeam;
    this.secondTeam = secondTeam;
    this.isActive = isActive;
  }

  public MatchDTO(Match entityMatch) {
    this.id = entityMatch.getId();
    this.date = entityMatch.getDate();
    this.result = entityMatch.getResult();
    this.firstTeam = entityMatch.getFirstTeam();
    this.secondTeam = entityMatch.getSecondTeam();
    this.isActive = entityMatch.getisActive();
  }

  public Instant getDate() {
    return date;
  }

  public void setDate(Instant date) {
    this.date = date;
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

  public BetStatusEnum getResult() {
    return result;
  }

  public void setResult(BetStatusEnum result) {
    this.result = result;
  }

  public Boolean getActive() {
    return isActive;
  }

  public void setActive(Boolean active) {
    isActive = active;
  }
}
