package br.com.hexabet.api.dto;

import br.com.hexabet.api.entities.Group;

public class GroupDTO {
  private Long id;
  private String name;


  public GroupDTO() {
  }

  public GroupDTO(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public GroupDTO(Group entityGroup) {
    this.id = entityGroup.getId();
    this.name = entityGroup.getName();
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

}
