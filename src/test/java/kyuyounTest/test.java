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
	
	
	// @Test 
	// void insert() {
	//	 CommunityDTO dto = new CommunityDTO(3L, "제목","",LocalDateTime.now(),"문의사항");
	//	 for (int i=0; i<=3; i++) { 
	//		 commCon.insert(dto); 
	//   		} 
	//  }
	 
	@ParameterizedTest
	@ValueSource(strings ="코딩이야기")
	void list(String category){
		List<CommunityResponseDTO> dblist =commCon.commList(category);
		System.out.println("제이유닛에서 리스 "+dblist.toString());
	}
	
}
