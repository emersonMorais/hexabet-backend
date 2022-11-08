package br.com.hexabet.api.dto;

import br.com.hexabet.api.entities.Group;
import br.com.hexabet.api.entities.Team;

public class TeamDTO {

  private Long id;
  private String countryName;
  private Group groupId;

  public TeamDTO() {
  }

  public TeamDTO(Team entityTeam) {
    this.id = entityTeam.getId();
    this.countryName = entityTeam.getcountryName();
    this.groupId = entityTeam.getGroupId();
  }

  public TeamDTO(Long id, String countryName, Group groupId) {
    this.id = id;
    this.countryName = countryName;
    this.groupId = groupId;
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

}
