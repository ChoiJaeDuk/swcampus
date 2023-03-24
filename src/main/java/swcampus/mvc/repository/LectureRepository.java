package swcampus.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import swcampus.mvc.domain.Category;
import swcampus.mvc.domain.Lecture;

public interface LectureRepository extends JpaRepository<Lecture, Long> {

	
	  /**
     * 모든 강의 조회
     */
    List<Lecture> findAll();

   
    /**
     * 강의 상세조회
     */
    Lecture findByLectureNo(Long id);
    
    
    
    /**
     * 카테고리별 강의조회
     */
    List<Lecture> findByCategory(String category_no);







}
