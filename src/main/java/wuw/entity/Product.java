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
@Table(name = "Product", schema = "wuw", catalog = "")
public class Product {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private String id;
  @Basic
  @Column(name = "name")
  private String name;
  @Basic
  @Column(name = "price")
  private long price;
  @Basic
  @Column(name = "stock_quantity")
  private long stockQuantity;
  @Basic
  @Column(name = "brand")
  private String brand;
  @Basic
  @Column(name = "description")
  private String description;
  @Basic
  @Column(name = "category_id")
  private String categoryId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public long getStockQuantity() {
    return stockQuantity;
  }

  public void setStockQuantity(long stockQuantity) {
    this.stockQuantity = stockQuantity;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
    Product that = (Product) o;
    return price == that.price && stockQuantity == that.stockQuantity && Objects.equals(id,
        that.id) && Objects.equals(name, that.name) && Objects.equals(brand,
        that.brand) && Objects.equals(description, that.description)
        && Objects.equals(categoryId, that.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, stockQuantity, brand, description, categoryId);
  }
}
