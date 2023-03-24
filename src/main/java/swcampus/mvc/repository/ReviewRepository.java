package swcampus.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import swcampus.mvc.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>, QuerydslPredicateExecutor<Review>{

}
