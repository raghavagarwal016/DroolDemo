package DroolsDemo.DroolsDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "order_product")
public class OrderProduct {
  @Id
  private String orderId;
  private String orderName;
  private String orderCardType;
  private double orderPrice;
  private double orderDiscount;
}
