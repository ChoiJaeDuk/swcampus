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
	
	/**
	 * 리뷰 등록
	 * @param reviewDTO
	 */
	void reviewInsert(ReviewRequestDTO reviewDTO);
	
	/**
	 * 리뷰번호에 해당하는 리뷰를 삭제한다.
	 * @param reviewNo
	 */
	void reviewDelete(Long reviewNo);
	
	/**
	 * 강의번호에 해당하는 리뷰리스트를 불러온다
	 * @param lectureNo
	 * @return
	 */
	PageResponseDTO<ReviewResponseDTO, Review> reviewSelectByLectureId(Long lectureNo);
	
	/**
	 * 관리자 승인 
	 * @param reviewNo
	 */
	void reviewConfirm(Long reviewNo);
	
	/**
	 * 강의 번호를 받아 강의의 평점을 불러온다.
	 * @param LectureNo
	 * @return
	 */
	double reviewStarAvg(Long LectureNo);
	
}
