package br.com.hexabet.api.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import br.com.hexabet.api.entities.User;


public class UserDTO {
  private Long id; 
  private String name; 
  private String email;
  private Date createdAt;
  private Date updatedAt;
  
  private Set<BetDTO> bets = new HashSet<>();

  public UserDTO() {}

  public UserDTO(Long id, String name, String email, Date createdAt, Date updatedAt) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }
  
  public UserDTO(User entityBet) {
    id = entityBet.getId();
    name = entityBet.getName();
    email = entityBet.getEmail();
    createdAt = entityBet.getCreatedAt();
    updatedAt = entityBet.getCreatedAt();    
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Set<BetDTO> getBets() {
    return bets;
  }

}
