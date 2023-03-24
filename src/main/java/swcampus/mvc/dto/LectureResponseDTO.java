package swcampus.mvc.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class LectureResponseDTO {

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


}
