package wuw.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Payment", schema = "wuw", catalog = "")
public class Payment {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private String id;
  @Basic
  @Column(name = "order_id")
  private String orderId;
  @Basic
  @Column(name = "payment_date")
  private Timestamp paymentDate;
  @Basic
  @Column(name = "payment_method")
  private String paymentMethod;
  @Basic
  @Column(name = "total_amount")
  private long totalAmount;

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

  public Timestamp getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Timestamp paymentDate) {
    this.paymentDate = paymentDate;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public long getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(long totalAmount) {
    this.totalAmount = totalAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment that = (Payment) o;
    return totalAmount == that.totalAmount && Objects.equals(id, that.id)
        && Objects.equals(orderId, that.orderId) && Objects.equals(paymentDate,
        that.paymentDate) && Objects.equals(paymentMethod, that.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderId, paymentDate, paymentMethod, totalAmount);
  }
}
