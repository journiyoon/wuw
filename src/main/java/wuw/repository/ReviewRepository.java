package wuw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wuw.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, String> {

}
