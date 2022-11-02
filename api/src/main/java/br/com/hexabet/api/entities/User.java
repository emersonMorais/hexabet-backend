package br.com.hexabet.api.entities;

import java.time.OffsetDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id; 
  private String name; 
  @Column(unique = true)
  private String email;
  private String password; 
  private String role;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  
  private User() {}

  public User(Long id, String name, String email, String password, String role, OffsetDateTime createdAt,
      OffsetDateTime updatedAt) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.role = role;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getRole() {
    return role;
  }

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof User))
      return false;
    User other = (User) obj;
    return Objects.equals(id, other.id);
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
        + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
  }

  
  
  
}
