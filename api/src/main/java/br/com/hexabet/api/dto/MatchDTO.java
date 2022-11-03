package br.com.hexabet.api.dto;

import java.time.Instant;

import br.com.hexabet.api.entities.Match;
import br.com.hexabet.api.entities.Team;

public class MatchDTO {
  private Long id;
  private Instant date;
  private String result;

  private Team firstTeam;
  private Team secondTeam;

  public MatchDTO() {
  }

 
  public MatchDTO(Long id, Instant date, String result, Team firstTeam, Team secondTeam) {
    this.id = id;
    this.date = date;
    this.result = result;
    this.firstTeam = firstTeam;
    this.secondTeam = secondTeam;
  }

  public MatchDTO(Match entityMatch) {
    this.id = entityMatch.getId();
    this.date = entityMatch.getDate();
    this.result = entityMatch.getResult();
    this.firstTeam = entityMatch.getFirstTeam();
    this.secondTeam = entityMatch.getSecondTeam();
  }

  public Instant getDate() {
    return date;
  }

  public void setDate(Instant date) {
    this.date = date;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
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

}
