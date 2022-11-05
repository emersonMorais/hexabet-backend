package br.com.hexabet.api.dto;

import br.com.hexabet.api.entities.Role;

public class RoleDTO {
  private Long id; 
  private String permission;
  
  public RoleDTO() {}

  public RoleDTO(Long id, String permission) {
    this.id = id;
    this.permission = permission;
  }

  public RoleDTO(Role entityRole) {
    this.id = entityRole.getId();
    this.permission = entityRole.getPermission(); 
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

  
}
