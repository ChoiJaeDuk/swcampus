package doyoonRTest;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import swcampus.mvc.controller.LectureController;
import swcampus.mvc.dto.LectureDTO;
import swcampus.mvc.repository.LectureRepository;


@SpringBootTest
@Transactional
@Commit
public class LectureTest {
	
	@Autowired
	private LectureRepository LectureRep;
	
	@Autowired
	private LectureController lectureCon;
	
	@Test
	void lecin(){
		for (int i =0; i<=2;i++) {
			LectureDTO dto = new LectureDTO(3L, "KOSTA", "취업자", "오프라인", "안녕", "지현", "ai", LocalDateTime.now(), LocalDateTime.now(),"as@fdg",3L);
		lectureCon.lectureInsert(dto);
		}
	}
	
	@Test
	private seleLec(Long aaa) {
		lectureCon.selectLec(3L);
	}
	

	
}
