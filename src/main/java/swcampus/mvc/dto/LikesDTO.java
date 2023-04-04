package swcampus.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swcampus.mvc.domain.Likes;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LikesDTO {
	
	private Long likesNo;	

	private Long lectureNo;

	private Long userNo;
	
	public LikesDTO(Likes li) {
		this.likesNo = li.getLikesNo();
		this.lectureNo=li.getLecture().getLectureNo();
		this.userNo=li.getUser().getUserNo();
	}
}
