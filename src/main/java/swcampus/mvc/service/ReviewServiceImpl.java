package swcampus.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.Review;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.page.PageResponseDTO;
import swcampus.mvc.dto.review.ReviewRequestDTO;
import swcampus.mvc.dto.review.ReviewResponseDTO;
import swcampus.mvc.repository.LectureRepository;
import swcampus.mvc.repository.ReviewRepository;
import swcampus.mvc.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class ReviewServiceImpl implements ReviewService {
	
	private final UserRepository userRep;
	private final LectureRepository lectureRep;
	private final ReviewRepository reviewRep;

	@Override
	public void reviewInsert(ReviewRequestDTO reviewDTO) {
		Lecture lecture = lectureRep.getReferenceById(reviewDTO.getLectureNo());
		User user = userRep.getReferenceById(reviewDTO.getUserNo());
		Review review = toEntity(reviewDTO, lecture, user);
		
		reviewRep.save(review);
	}

	@Override
	public void reviewDelete(Long reviewNo) {
		reviewRep.deleteById(reviewNo);
	}

	@Override
	public PageResponseDTO<ReviewResponseDTO, Review> reviewSelectByLectureId(Long lectureNo) {
		
		return null;
	}

	@Override
	public void reviewConfirm(Long reviewNo) {
		Review review = reviewRep.findById(reviewNo).get();
		review.setReviewCheck(true);
	}

}
