package wuw.dto;

import lombok.Getter;

@Getter
public class OrderDetailDTO {

  private String id;
  private String orderId;
  private String productId;
  private long quantity;
  private long subtotal;
}
