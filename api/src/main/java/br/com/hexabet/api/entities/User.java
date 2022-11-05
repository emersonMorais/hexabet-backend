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
import javax.persistence.Table;

@Entity
@Table(name = "tb_users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id; 
  private String firstName;
  private String lastName; 
  @Column(unique = true)
  private String email;
  private String password; 
  @Column(nullable = true)
  private Date createdAt;
  @Column(nullable = true)
  private Date updatedAt;


  
  @ManyToMany
  @JoinTable(
    name = "user_role",
    joinColumns = @JoinColumn(name="user_id"),
    inverseJoinColumns = @JoinColumn(name="role_id")
  )
  private Set<Role> roles = new HashSet<>();


  @ManyToMany
  @JoinTable(
    name = "user_bet",
    joinColumns = @JoinColumn(name="user_id"),
    inverseJoinColumns = @JoinColumn(name="bet_id")
  )
  private Set<Bet> bets = new HashSet<>();
  
  public User() {}

  public User(Long id, String firstName, String lastName, String email, String password, Date createdAt,
      Date updatedAt) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

  public Set<Bet> getBets() {
    return bets;
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
    return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
        + password + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", bets=" + bets + "]";
  }

  
}
