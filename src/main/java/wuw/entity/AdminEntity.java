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
@Table(name = "Admin", schema = "wuw", catalog = "")
public class AdminEntity {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private String id;
  @Basic
  @Column(name = "username")
  private String username;
  @Basic
  @Column(name = "password")
  private long password;
  @Basic
  @Column(name = "email")
  private long email;

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

  public long getPassword() {
    return password;
  }

  public void setPassword(long password) {
    this.password = password;
  }

  public long getEmail() {
    return email;
  }

  public void setEmail(long email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminEntity that = (AdminEntity) o;
    return password == that.password && email == that.email && Objects.equals(id, that.id)
        && Objects.equals(username, that.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, password, email);
  }
}
