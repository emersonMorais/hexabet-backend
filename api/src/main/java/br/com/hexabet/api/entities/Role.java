package br.com.hexabet.api.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_role")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id; 
  private String permission;

  public Role () {}

  public Role(Long id, String permission) {
    this.id = id;
    this.permission = permission;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permission);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Role))
      return false;
    Role other = (Role) obj;
    return Objects.equals(id, other.id) && Objects.equals(permission, other.permission);
  }

  @Override
  public String toString() {
    return "Role [id=" + id + ", permission=" + permission + "]";
  }

}
