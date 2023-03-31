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

import lombok.RequiredArgsConstructor;
import swcampus.mvc.SwcampusApplication;
import swcampus.mvc.controller.CommunityController;
import swcampus.mvc.controller.ReplyController;
import swcampus.mvc.dto.CommunityDTO;
import swcampus.mvc.dto.CommunityResponseDTO;
import swcampus.mvc.dto.ReplyDTO;
import swcampus.mvc.repository.CommunityRepository;
import swcampus.mvc.service.CommunityService;
import swcampus.mvc.service.ReplyService;

@SpringBootTest
@Commit
@Transactional
@ContextConfiguration(classes = SwcampusApplication.class)
@RequiredArgsConstructor
public class test {

	@Autowired
	private CommunityRepository commRep;
	
	@Autowired
	private CommunityController commCon;
	
	@Autowired
	private CommunityService conService;
	
	@Autowired
	private ReplyController reCon; 
	
	
	
	  @Test void insert() {
	  for (int i=0; i<=3; i++) { 
		  CommunityDTO dto = new CommunityDTO(null,1L,"제목"+i,"테스트"+i,LocalDateTime.of(2023, 3, 30, 1, 1),"코딩이야기",LocalDateTime.now()); 
		  String boardType="code";
		  commCon.insert(dto,boardType); }
	  }
	 
	 
	@ParameterizedTest
	@ValueSource(strings ="코딩이야기")
	void list(String category){
		//List<CommunityResponseDTO> dblist =commCon.commList(category);
		//System.out.println("제이유닛에서 리스 "+dblist.toString());
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
	
	@Test
	void insertReply(){
		for(int i = 0;i<=2;i++) {
		ReplyDTO reDTO = new ReplyDTO(24L,2L , "댓글 테스트"+i);
		reCon.insertReply(reDTO);
		}
	}
	
	@ParameterizedTest
	@ValueSource(longs = 8L)
	void deReply(Long commNo){
		reCon.deleteReply(commNo);
	}
	@ParameterizedTest
	@ValueSource(longs = 6L)
	void reply(Long commNo){
		//commCon.read(commNo );
	}
	
}
