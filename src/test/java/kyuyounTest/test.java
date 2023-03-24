package kyuyounTest;


import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;

import swcampus.mvc.SwcampusApplication;
import swcampus.mvc.controller.CommunityController;
import swcampus.mvc.dto.CommunityDTO;
import swcampus.mvc.dto.CommunityResponseDTO;
import swcampus.mvc.repository.CommunityRepository;

@SpringBootTest
@Commit
@Transactional
@ContextConfiguration(classes = SwcampusApplication.class)
public class test {

	@Autowired
	private CommunityRepository commRep;
	
	@Autowired
	private CommunityController commCon;
	
	
	/*
	 * @Test void insert() {
	 * 
	 * for (int i=0; i<=3; i++) { CommunityDTO dto = new CommunityDTO(null,1L,
	 * "제목"+i,"테스트"+i,LocalDateTime.now(),"공지사"); commCon.insert(dto); } }
	 */
	 
	@ParameterizedTest
	@ValueSource(strings ="코딩이야기")
	void list(String category){
		List<CommunityResponseDTO> dblist =commCon.commList(category);
		System.out.println("제이유닛에서 리스 "+dblist.toString());
	}
	
	@Test
	void up() {
		CommunityDTO dto = new CommunityDTO(8L, 3L, "수정 다시 !!", "수정", LocalDateTime.now(), "코딩이야기",LocalDateTime.now());
		commCon.update(dto);
	}
	
	@ParameterizedTest
	@ValueSource(longs = 14L)
	void de(Long commNo){
		commCon.delete(commNo);
	}
}
