package br.com.hexabet.api.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import br.com.hexabet.api.entities.User;

public class UserDTO {
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private Date createdAt;
  private Date updatedAt;

  private Set<BetDTO> bets = new HashSet<>();

  public UserDTO() {
  }

  public UserDTO(Long id, String firstName, String lastName, String email, Date createdAt, Date updatedAt) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public UserDTO(User entityUser) {
    id = entityUser.getId();
    firstName = entityUser.getFirstName();
    lastName = entityUser.getLastName();
    email = entityUser.getEmail();
    createdAt = entityUser.getCreatedAt();
    updatedAt = entityUser.getCreatedAt();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
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
