package swcampus.mvc.doo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.web.WebAppConfiguration;

import swcampus.mvc.controller.LectureController;
import swcampus.mvc.dto.LectureDTO;
import swcampus.mvc.repository.LectureRepository;
import swcampus.mvc.service.LectureService;

@WebAppConfiguration
@SpringBootTest
@Transactional
@Commit
public class LectureTest {
	
	@Autowired
	private LectureRepository LectureRep;
	
	@Autowired
	private LectureController lectureCon;
	
	@Autowired
	private LectureService lecSer;
	
	

	@Test
	void lecin(){
		for (int i =0; i<=2;i++) {
			LectureDTO dto = new LectureDTO(null,3L,  "KOSTA", "취업자", "ai","제목"+i, "지현쌤", "ai과정", LocalDateTime.now(), LocalDateTime.now(),"as@fdg",2L,1,LocalDate.now());
			lecSer.insertLecture(dto);
		}
	}

	
	
	@ParameterizedTest
	@ValueSource(longs = 4L)
	 void selectLec(Long lectureNo) {
		//lectureCon.selectLec(lectureNo);
	}
	 
	
	@ParameterizedTest
	@ValueSource(longs = 9L)
	 void deleteLec(Long lectureNo) {
		lectureCon.deleteLec(lectureNo);
	}
	
	
	/*
	 *  @Test
	
	   void lecup() {
	      LectureDTO dto = new LectureDTO(13L,3L, "에이전2", "타겟2", "온라인수정2", "안녕2", "강사님2", "디테일2", LocalDateTime.now(), LocalDateTime.now(),"test@fdg",1L);
	      lectureCon.lectureUpdate(dto);
	   }
	    */

	@Test
	void sdddd() {
		lecSer.selectAll();
	}
	

	
}
