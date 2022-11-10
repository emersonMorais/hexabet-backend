package br.com.hexabet.api.dto;

import br.com.hexabet.api.entities.Group;
import br.com.hexabet.api.entities.Team;

public class TeamDTO {

  private Long id;
  private String countryName;
  private Group groupId;

  private String flagUrl;

  public TeamDTO() {
  }

  public TeamDTO(Team entityTeam) {
    this.id = entityTeam.getId();
    this.countryName = entityTeam.getcountryName();
    this.groupId = entityTeam.getGroupId();
    this.flagUrl = entityTeam.getImgFlagUrl();
  }

  public TeamDTO(Long id, String countryName, Group groupId, String flagUrl) {
    this.id = id;
    this.countryName = countryName;
    this.groupId = groupId;
    this.flagUrl = flagUrl;
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

  public Group getGroupId() {
    return groupId;
  }

  public void setGroupId(Group groupId) {
    this.groupId = groupId;
  }

  public String getFlagUrl() {
    return flagUrl;
  }

  public void setFlagUrl(String flagUrl) {
    this.flagUrl = flagUrl;
  }
}
