package swcampus.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swcampus.mvc.domain.Category;
import swcampus.mvc.domain.Review;

public interface AdminRepository extends JpaRepository<Review, Long> {

}
