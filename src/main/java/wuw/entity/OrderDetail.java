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
@Table(name = "OrderDetail", schema = "wuw", catalog = "")
public class OrderDetail {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private String id;
  @Basic
  @Column(name = "order_id")
  private String orderId;
  @Basic
  @Column(name = "product_id")
  private String productId;
  @Basic
  @Column(name = "quantity")
  private long quantity;
  @Basic
  @Column(name = "subtotal")
  private long subtotal;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }

  public long getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(long subtotal) {
    this.subtotal = subtotal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetail that = (OrderDetail) o;
    return quantity == that.quantity && subtotal == that.subtotal && Objects.equals(id,
        that.id) && Objects.equals(orderId, that.orderId) && Objects.equals(
        productId, that.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderId, productId, quantity, subtotal);
  }
}
