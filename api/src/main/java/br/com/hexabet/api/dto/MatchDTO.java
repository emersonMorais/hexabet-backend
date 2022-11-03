package br.com.hexabet.api.dto;

import java.time.Instant;

import br.com.hexabet.api.entities.Match;
import br.com.hexabet.api.entities.Team;

public class MatchDTO {
  private Long id;
  private Instant date;
  private String result;

  private Team firstTeamCountryName;
  private Team secondTeamCountryName;

  public MatchDTO() {
  }

  public MatchDTO(Long id, Instant date, String result, Team firstTeamCountryName, Team secondTeamCountryName) {
    this.id = id;
    this.date = date;
    this.result = result;
    this.firstTeamCountryName = firstTeamCountryName;
    this.secondTeamCountryName = secondTeamCountryName;
  }

  public MatchDTO(Match entityMatch) {
    this.id = entityMatch.getId();
    this.date = entityMatch.getDate();
    this.result = entityMatch.getResult();
    this.firstTeamCountryName = entityMatch.getFirstTeam();
    this.secondTeamCountryName = entityMatch.getSecondTeam();
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

  public Team getFirsTeam() {
    return firstTeamCountryName;
  }

  public void setFirsTeam(Team firsTeam) {
    this.firstTeamCountryName = firsTeam;
  }

  public Team getSecondTeam() {
    return secondTeamCountryName;
  }

  public void setSecondTeam(Team secondTeam) {
    this.secondTeamCountryName = secondTeam;
  }

  public Team getFirstTeamCountryName() {
    return firstTeamCountryName;
  }

  public void setFirstTeamCountryName(Team firstTeamCountryName) {
    this.firstTeamCountryName = firstTeamCountryName;
  }

  public Team getSecondTeamCountryName() {
    return secondTeamCountryName;
  }

  public void setSecondTeamCountryName(Team secondTeamCountryName) {
    this.secondTeamCountryName = secondTeamCountryName;
  }

}
