package wuw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wuw.entity.Shipment;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, String> {

}
