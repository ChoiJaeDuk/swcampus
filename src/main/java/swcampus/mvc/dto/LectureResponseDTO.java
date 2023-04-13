package swcampus.mvc.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import swcampus.mvc.domain.Likes;

@Data
@Builder
@AllArgsConstructor
public class LectureResponseDTO {
	private Long lectureNo;
	
	private Long userNo;
	
	private String lectureAgency;
	
	private String lectureTarget;
	
	private String lectureMethod;
	
	private String lectureTitle;
	
	private String lectureTeacher;
	
	private String lecture_classDetail;
	
	private LocalDateTime lectureStartDate;

	private LocalDateTime lectureEndDate;

	private String lectureUrl;

	private String categoryName;
	
	private LocalDate lectureRegDate;

		



}
