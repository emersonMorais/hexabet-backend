package br.com.hexabet.api.entities;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "tb_team")
public class Team {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String countryName;

  private String imgFlagUrl;
  
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "group_id")
  private Group groupId;


  public Team() {}

  public Team(Long id, String countryName, String groupTeam, String imgFlagUrl) {
    this.id = id;
    this.countryName = countryName;
    this.imgFlagUrl = imgFlagUrl;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getcountryName() {
    return countryName;
  }

  public void setcountryName(String countryName) {
    this.countryName = countryName;
  }

  public Group getGroupId() {
    return groupId;
  }

  public void setGroupId(Group groupId) {
    this.groupId = groupId;
  }

  public String getImgFlagUrl() {
    return imgFlagUrl;
  }

  public void setImgFlagUrl(String imgFlagUrl) {
    this.imgFlagUrl = imgFlagUrl;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Team other = (Team) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Team [id=" + id + ", countryName=" + countryName + ", groupId=" + groupId + "]";
  }

}
