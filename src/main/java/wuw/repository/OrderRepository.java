package wuw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wuw.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

}
