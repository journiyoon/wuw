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
@Table(name = "CartItem", schema = "wuw", catalog = "")
public class CartItem {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private String id;
  @Basic
  @Column(name = "cart_id")
  private String cartId;
  @Basic
  @Column(name = "product_id")
  private String productId;
  @Basic
  @Column(name = "quantity")
  private long quantity;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCartId() {
    return cartId;
  }

  public void setCartId(String cartId) {
    this.cartId = cartId;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItem that = (CartItem) o;
    return quantity == that.quantity && Objects.equals(id, that.id)
        && Objects.equals(cartId, that.cartId) && Objects.equals(productId,
        that.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cartId, productId, quantity);
  }
}
