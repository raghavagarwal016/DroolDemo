package DroolsDemo.DroolsDemo.service.impl;

import java.util.UUID;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DroolsDemo.DroolsDemo.dto.OrderDto;
import DroolsDemo.DroolsDemo.entity.OrderProduct;
import DroolsDemo.DroolsDemo.repository.OrderRepository;
import DroolsDemo.DroolsDemo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderRepository orderRepository;

  @Autowired
  private KieSession session;

  @Override
  public OrderProduct addOrder(OrderDto orderDto) {
    OrderProduct order = new OrderProduct();
    BeanUtils.copyProperties(orderDto, order);
    order.setOrderId(UUID.randomUUID().toString());
    session.insert(order);
    session.fireAllRules();
    return orderRepository.save(order);
  }


}
