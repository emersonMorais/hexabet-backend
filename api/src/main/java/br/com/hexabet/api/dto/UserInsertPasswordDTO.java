package br.com.hexabet.api.dto;

public class UserInsertPasswordDTO extends UserDTO {
  private String password;

  UserInsertPasswordDTO() {
    super();
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
