package swcampus.mvc.service;

import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.Review;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.page.PageResponseDTO;
import swcampus.mvc.dto.review.ReviewRequestDTO;
import swcampus.mvc.dto.review.ReviewResponseDTO;

public interface ReviewService {
	
	default Review toEntity(ReviewRequestDTO reviewDTO, Lecture lecture, User user) {
		return Review.builder()
				.lecture(lecture)
				.user(user)
				.reviewStar(reviewDTO.getReviewStar())
				.reviewContent(reviewDTO.getReviewContent())
				.reviewImg(reviewDTO.getReviewImg())
				.build();
	}
	
	default ReviewResponseDTO toDTO(Review review) {
		return ReviewResponseDTO.builder()
				.userName(review.getUser().getUserName())
				.reviewContent(review.getReviewContent())
				.reviewStar(review.getReviewStar())
				.build();
	}
	
	void reviewInsert(ReviewRequestDTO reviewDTO);
	
	void reviewDelete(Long reviewNo);
	
	PageResponseDTO<ReviewResponseDTO, Review> reviewSelectByLectureId(Long lectureNo);
	
	void reviewConfirm(Long reviewNo);
	
}
