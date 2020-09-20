package DroolsDemo.DroolsDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import DroolsDemo.DroolsDemo.entity.OrderProduct;

public interface OrderRepository extends JpaRepository<OrderProduct, String> {
}
