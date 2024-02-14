package wuw.dto;

import lombok.Getter;

@Getter
public class ReviewDTO {

  private String id;
  private String productId;
  private String userId;
  private short rating;
  private String comment;
}
