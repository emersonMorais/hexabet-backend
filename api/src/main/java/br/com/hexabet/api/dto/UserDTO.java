package br.com.hexabet.api.dto;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.hexabet.api.entities.User;

public class UserDTO {
  private Long id;
  
  @Size(min = 3, max = 30, message = "Deve ter entre 5 e 30 caracteres")
  @NotBlank(message = "Campo obrigatório")
  private String firstName;

  @NotBlank(message = "Campo obrigatório")
  private String lastName;

  @Email(message = "Digitar um e-mail válido")
  private String email;

  private Instant createdAt;
  private Instant updatedAt;

  private Integer score; 

  private Set<RoleDTO> roles = new HashSet<>();
  

  public UserDTO() {
  }

  public UserDTO(Long id, String firstName, String lastName, String email, Instant createdAt, Instant updatedAt, Integer score) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.score = score;
    this.createdAt = createdAt = Instant.now();
    this.updatedAt = updatedAt = Instant.now();
  }

  public UserDTO(User entityUser) {
    id = entityUser.getId();
    firstName = entityUser.getFirstName();
    lastName = entityUser.getLastName();
    email = entityUser.getEmail();
    createdAt = entityUser.getCreatedAt();
    updatedAt = entityUser.getCreatedAt();
    entityUser.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
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

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Set<RoleDTO> getRoles() {
    return roles;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  

}
