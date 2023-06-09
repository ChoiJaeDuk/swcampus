package swcampus.mvc.dto.review;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ReviewRequestDTO {
	private Long reviewNo;
	
	private Long lectureNo;
	
	private Long userNo;
	
	private double reviewStar;
	
	private String reviewContent;
	
	private boolean reviewCheck;
	
	private String reviewImg;
}
