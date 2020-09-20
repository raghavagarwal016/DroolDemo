package DroolsDemo.DroolsDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DroolsDemo.DroolsDemo.dto.OrderDto;
import DroolsDemo.DroolsDemo.entity.OrderProduct;
import DroolsDemo.DroolsDemo.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

  @Autowired
  private OrderService orderService;

  @PostMapping("/new-order")
  public ResponseEntity<OrderProduct> addOrder(@RequestBody OrderDto orderDto) {
    return new ResponseEntity<>(orderService.addOrder(orderDto), HttpStatus.OK);
  }

}
