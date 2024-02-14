package wuw.dto;

import java.sql.Timestamp;
import lombok.Getter;

@Getter
public class OrderDTO {

  private String id;
  private String userId;
  private Timestamp orderDate;
  private byte status;
}
