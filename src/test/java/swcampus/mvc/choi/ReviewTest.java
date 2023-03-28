package swcampus.mvc.choi;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.annotation.Commit;

import com.querydsl.jpa.impl.JPAQueryFactory;

import swcampus.mvc.domain.Review;
import swcampus.mvc.dto.review.ReviewRequestDTO;
import swcampus.mvc.repository.ReviewRepository;
import swcampus.mvc.service.ReviewService;

@SpringBootTest
@Transactional
@Commit
public class ReviewTest {
	
	@Autowired
	private ReviewService reviewService;
	
	@Autowired
	private ReviewRepository reviewRep;
	
	@Autowired
	private JPAQueryFactory jpaQueryFactory;
	
	
	@Test
	void reviewInsert() {
		ReviewRequestDTO reviewDTO = 
				ReviewRequestDTO.builder()
				.lectureNo(1L)
				.userNo(4L)
				.reviewStar(4)
				.reviewContent("이 강의를 들으면 바로 취직 가능합니다")
				.reviewImg("kosta.img")
				.build();
		
		reviewService.reviewInsert(reviewDTO);
	}
	
	
	@ParameterizedTest
	@ValueSource(longs = 1L)
	void reviewSelect(Long lectureNo) {
		List<Review> list = reviewRep.findByLectureLectureNo(lectureNo);
		
		for(Review l:list) {
			System.out.println(l);
		}
		
	}
	
	@Test
	void reviewStarAvg() {
//		double d = reviewRep.reviewStarAvg(1L);
//		
//		System.out.println(d);
		
		System.out.println(reviewService.reviewStarAvg(1L));
	}
	
}
