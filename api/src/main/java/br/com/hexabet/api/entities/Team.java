package br.com.hexabet.api.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_team")
public class Team {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private char groupTeam;

  @OneToMany(mappedBy = "id")
  private Set<Match> matches = new HashSet<>();

  public Team(Long id, String name, char groupTeam) {
    this.id = id;
    this.name = name;
    this.groupTeam = groupTeam;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public char getGroupTeam() {
    return groupTeam;
  }

  public void setGroupTeam(char groupTeam) {
    this.groupTeam = groupTeam;
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

}
