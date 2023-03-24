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
import swcampus.mvc.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class ReviewServiceImpl implements ReviewService {
	
	private final UserRepository userRep;

	@Override
	public void reviewInsert(ReviewRequestDTO reviewDTO) {
		User user = userRep.getReferenceById(reviewDTO.getUserNo());
		Review review = toEntity(reviewDTO, null, user);

	}

	@Override
	public void reviewDelete(Long reviewNo) {
		// TODO Auto-generated method stub

	}

	@Override
	public PageResponseDTO<ReviewResponseDTO, Review> reviewSelectByLectureId(Long lectureNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reviewConfirm(boolean reviewCheck) {
		// TODO Auto-generated method stub

	}

}
