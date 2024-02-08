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
@Table(name = "Review", schema = "wuw", catalog = "")
public class Review {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private String id;
  @Basic
  @Column(name = "product_id")
  private String productId;
  @Basic
  @Column(name = "user_id")
  private String userId;
  @Basic
  @Column(name = "rating")
  private short rating;
  @Basic
  @Column(name = "comment")
  private String comment;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public short getRating() {
    return rating;
  }

  public void setRating(short rating) {
    this.rating = rating;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Review that = (Review) o;
    return rating == that.rating && Objects.equals(id, that.id) && Objects.equals(
        productId, that.productId) && Objects.equals(userId, that.userId)
        && Objects.equals(comment, that.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, userId, rating, comment);
  }
}
