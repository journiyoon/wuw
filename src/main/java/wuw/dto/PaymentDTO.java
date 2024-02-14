package wuw.dto;

import java.sql.Timestamp;
import lombok.Getter;

@Getter
public class PaymentDTO {

  private String id;
  private String orderId;
  private Timestamp paymentDate;
  private String paymentMethod;
  private long totalAmount;
}
