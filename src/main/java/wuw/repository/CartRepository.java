package wuw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wuw.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, String> {

}
