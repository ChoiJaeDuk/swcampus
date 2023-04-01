package swcampus.mvc.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter		
public class LectureDTO {
	
	private Long LectureNo;
	
	private Long userNo;//어드민
	
	private String lectureAgency;

	private String lectureTarget;

	private String lectureMethod;

	private String lectureTitle;

	private String lectureTeacher;

	private String lecture_classDetail;

	private LocalDateTime lectureStartDate;

	private LocalDateTime lectureEndDate;
	
	private String lectureUrl;
	
	private Long categoryNo;
	
	private int lectureLikeIs;
	





}
