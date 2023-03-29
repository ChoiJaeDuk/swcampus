package swcampus.mvc.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import swcampus.mvc.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>, QuerydslPredicateExecutor<Review>{
	
	List<Review> findByLectureLectureNo(Long lectureNo);
}
