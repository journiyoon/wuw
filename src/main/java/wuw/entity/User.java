package wuw.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "User", schema = "wuw", catalog = "")
public class User {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private String id;
  @Basic
  @Column(name = "username")
  private String username;
  @Basic
  @Column(name = "password")
  private String password;
  @Basic
  @Column(name = "email")
  private String email;
  @Basic
  @Column(name = "phone")
  private String phone;
  @Basic
  @Column(name = "address")
  private String address;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User that = (User) o;
    return Objects.equals(id, that.id) && Objects.equals(username, that.username)
        && Objects.equals(password, that.password) && Objects.equals(email,
        that.email) && Objects.equals(phone, that.phone) && Objects.equals(
        address, that.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, password, email, phone, address);
  }
}
