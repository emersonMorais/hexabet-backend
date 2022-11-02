package br.com.hexabet.api.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_matches")
public class Match {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "match_id")
  private Long id;

  private Date date;

  private String result;

  @ManyToOne
  @JoinColumn(name = "team1_id")
  private Team firstTeam;

  
  @ManyToOne
  @JoinColumn(name = "team2_id")
  private Team secondTeam;

  @ManyToMany
  @JoinTable(
    name = "match_bets",
    joinColumns = @JoinColumn(name="match_id"),
    inverseJoinColumns = @JoinColumn(name="bet_id")
  )
  private Set<Bet> bets = new HashSet<>();

 
  public Match() {
  }

  public Match(Long id, Date date) {
    this.id = id;
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

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }


  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public Set<Bet> getBets() {
    return bets;
  }

  public void setBets(Set<Bet> bets) {
    this.bets = bets;
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
    return "Match [id=" + id + ", date=" + date + ", firstTeam=" + firstTeam + ", secondTeam=" + secondTeam + "]";
  }

}
