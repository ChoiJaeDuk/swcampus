package swcampus.mvc.choi;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.annotation.Commit;

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
	
	@Test
	void reviewInsert() {
		ReviewRequestDTO reviewDTO = 
				ReviewRequestDTO.builder()
				.lectureNo(1L)
				.userNo(2L)
				.reviewStar(5)
				.reviewContent("이 강의를 들으면 바로 취직 가능합니다")
				.reviewImg("kosta.img")
				.build();
		
		reviewService.reviewInsert(reviewDTO);
	}
	
	
	@Test
	void reviewSelect() {
		Page<Review> list = reviewRep.findByLectureLectureNo(1L);
		
		for(Review l:list) {
			System.out.println(l);
		}
		
	}
	
}
