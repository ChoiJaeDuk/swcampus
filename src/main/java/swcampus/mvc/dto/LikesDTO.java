package swcampus.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LikesDTO {
	
	private Long likesNo;	

	private Long lectureNo;

	private Long userNo;

}
