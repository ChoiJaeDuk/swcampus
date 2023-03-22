package swcampus.mvc.choi;

import java.nio.channels.GatheringByteChannel;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import swcampus.mvc.domain.User;
import swcampus.mvc.repository.UserRepository;
import swcampus.mvc.service.UserService;


@SpringBootTest
@Transactional
@Commit
public class UserTest {
	
	@Autowired
	private UserRepository userRep;
	
	@Autowired
	private UserService userService;
	
	@Test
	void userJoin() {
		userRep.save(User.builder()
				.userId("test")
				.userPassword("1234")
				.userEmail("test@test.com")
				.userName("테스트")
				.userCompany("테스트(주)")
				.userJob("테스트사원")
				.userRole("ROLE_USER")
				.build());
//		LocalDateTime time = LocalDateTime.now(); 
//		User user = new User(1L,"test","test@test.com","테스트","1234","ROLE_USER","테스트(주)", "테스트직", time);
//		userRep.save(user);
	}
	
}
