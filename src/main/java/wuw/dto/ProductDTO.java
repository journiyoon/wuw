package wuw.dto;

import lombok.Getter;

@Getter
public class ProductDTO {

  private String id;
  private String name;
  private long price;
  private long stockQuantity;
  private String brand;
  private String description;
  private String categoryId;
}
