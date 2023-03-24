package swcampus.mvc.choi;

import java.nio.channels.GatheringByteChannel;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Commit;

import swcampus.mvc.domain.Role;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.page.PageRequestDTO;
import swcampus.mvc.dto.page.PageResponseDTO;
import swcampus.mvc.dto.user.UserRequestDTO;
import swcampus.mvc.dto.user.UserResponseDTO;
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
//		userRep.save(User.builder()
//				.userId("test")
//				.userPassword("1234")
//				.userEmail("test@test.com")
//				.userName("테스트")
//				.userCompany("테스트(주)")
//				.userJob("테스트사원")
//				.userRole("ROLE_USER")
//				.build());
		for(int i=1; i<=10; i++) {
			userService.userJoin(new UserRequestDTO(1L, "test"+i,"test@test.com","테스트","010-2222-2222","1234",Role.ROLE_USER,"테스트(주)", "테스트직"));
		}
		//userRep.save(user);
	}
	
	@Test
	void selectUserList() {
		PageRequestDTO pageRequestDTO = new PageRequestDTO(1,5);
		
		PageResponseDTO<UserResponseDTO, User> list = userService.selectUserList(pageRequestDTO);
		
		for(UserResponseDTO u:list.getDtoList()) {
			System.out.println(u);
		}
	}
	
}
