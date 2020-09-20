package DroolsDemo.DroolsDemo.service;

import DroolsDemo.DroolsDemo.dto.OrderDto;
import DroolsDemo.DroolsDemo.entity.OrderProduct;

public interface OrderService {
  OrderProduct addOrder(OrderDto orderDto);
}
