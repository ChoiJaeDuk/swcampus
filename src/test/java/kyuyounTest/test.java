package kyuyounTest;


import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;

import swcampus.mvc.SwcampusApplication;
import swcampus.mvc.controller.CommunityController;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.CommunityDTO;
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
	
	@Test
	void insert() {
		User user= new User(1L, null, null, null, null, null, null, null);
		CommunityDTO dto = new CommunityDTO(user.getUserNo(), "제목","",LocalDateTime.now(),"자유게시판");
		for (int i=0; i<=5; i++) {
			commCon.insert(dto);
		}
	}
	
}
