package swcampus.mvc.service;

import java.util.List;

import swcampus.mvc.domain.Category;
import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.Likes;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.LectureDTO;
import swcampus.mvc.dto.LectureResponseDTO;
import swcampus.mvc.dto.LikesDTO;

public interface LectureService {
	
		/**
		 * 전체 강의검색
		 * */
		List<Lecture> selectAll();
		
		
		/**
		 * 강의 상세보기
		 */
		LectureResponseDTO selectByLectureNo(Long LectureNo);	
	
	   
	    /**
	     * 강의 작성하기
	     */
		void insertLecture(LectureDTO lectureDto);

	    /**
	     * 강의 삭제하기
	     */
		void deleteByLectureNo(Long LectureNo);

	  
	    /**
	     * 강의 수정
	     * @param 타겟, 메소드(온.오프),카테고리(java.cloud 등), 제목, 강사, 
	     * 		  강의상세보기, 강의시작일, 강의종료일,강의url
	     */
		void updateLecture(LectureDTO lectureDto);
		
		
		
		
		default  LectureResponseDTO toDto(Lecture lec) {
			
			return LectureResponseDTO.builder()
					.lectureAgency(lec.getLectureAgency())
					.lectureTarget(lec.getLectureTarget())
					.lectureMethod(lec.getLectureMethod())
					.lectureTitle(lec.getLectureTitle())
					.lectureTeacher(lec.getLectureTeacher())
					.lecture_classDetail(lec.getLecture_classDetail())
					.lectureStartDate(lec.getLectureStartDate())
					.lectureEndDate(lec.getLectureEndDate())
					.lectureUrl(lec.getLectureUrl())
					.categoryName(lec.getCategory().getCategoryName())
					.build();
		}
		
		
		
		
		default  Lecture toEntity(LectureDTO dto,User user, Category ca) {
			
			return Lecture.builder()
					.user(user)
					.lectureAgency(dto.getLectureAgency())
					.lectureTarget(dto.getLectureTarget())
					.lectureMethod(dto.getLectureMethod())
					.lectureTitle(dto.getLectureTitle())
					.lectureTeacher(dto.getLectureTeacher())
					.lecture_classDetail(dto.getLecture_classDetail())
					.lectureStartDate(dto.getLectureStartDate())
					.lectureEndDate(dto.getLectureEndDate())
					.lectureUrl(dto.getLectureUrl())
					.category(ca)
					.build();
		}

		 

		

	  
}
