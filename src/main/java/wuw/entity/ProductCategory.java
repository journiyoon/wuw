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
@Table(name = "ProductCategory", schema = "wuw", catalog = "")
public class ProductCategory {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "product_id")
  private String productId;
  @Basic
  @Column(name = "category_id")
  private String categoryId;

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCategory that = (ProductCategory) o;
    return Objects.equals(productId, that.productId) && Objects.equals(categoryId,
        that.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, categoryId);
  }
}
