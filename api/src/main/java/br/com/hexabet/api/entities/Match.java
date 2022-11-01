package br.com.hexabet.api.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

  @ManyToOne
  @JoinColumn(name = "team1_id")
  private Team home;

  @ManyToOne
  @JoinColumn(name = "team2_id")
  private Team away;

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

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Match))
      return false;
    Match other = (Match) obj;
    return Objects.equals(id, other.id);
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

}
