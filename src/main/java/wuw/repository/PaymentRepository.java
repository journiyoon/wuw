package wuw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wuw.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {

}
