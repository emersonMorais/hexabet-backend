package br.com.hexabet.api.dto;

import br.com.hexabet.api.entities.Team;

public class TeamDTO {

  private Long id;
  private String countryName;
  private String groupTeam;

  public TeamDTO() {
  }

  public TeamDTO(Team entityTeam) {
    this.id = entityTeam.getId();
    this.countryName = entityTeam.getcountryName();
    this.groupTeam = entityTeam.getGroupTeam();
  }

  public TeamDTO(Long id, String countryName, String groupTeam) {
    this.id = id;
    this.countryName = countryName;
    this.groupTeam = groupTeam;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public String getGroupTeam() {
    return groupTeam;
  }

  public void setGroupTeam(String groupTeam) {
    this.groupTeam = groupTeam;
  }

}
