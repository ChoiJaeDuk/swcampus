package swcampus.mvc.dto.review;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReviewResponseDTO {
	private String userName;
	
	private String reviewContent;
	
	private double reviewStar;
}
