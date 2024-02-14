package wuw.dto;

import lombok.Getter;

@Getter
public class CartItemDTO {

  private String id;
  private String cartId;
  private String productId;
  private long quantity;
}
