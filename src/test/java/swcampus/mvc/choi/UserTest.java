package swcampus.mvc.choi;

import java.nio.channels.GatheringByteChannel;
import java.time.LocalDateTime;
import java.util.List;

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
//				.userRole(Role.ROLE_USER)
//				.build());
		for(int i=11; i<=100; i++) {
			userService.userJoin(new UserRequestDTO(1L, "test"+i,"test@test.com","테스트","010-2222-2222","1234",Role.ROLE_USER,"테스트(주)", "테스트직"));
		}
		//userRep.save(user);
		
		//userService.userJoin(new UserRequestDTO(1L, "admin","admin@admin.com","관리자","010-2222-2222","1234",Role.ROLE_ADMIN,"SWCampus", "관리자"));
		
	}
	
	@Test
	void selectUserList() {
		PageRequestDTO pageRequestDTO = new PageRequestDTO(2,1);
		
		PageResponseDTO<UserResponseDTO, User> list = userService.selectUserList(pageRequestDTO);
		
//		for(UserResponseDTO u:list.getDtoList()) {
//			System.out.println(u);
//		}
		
		System.out.println(list);
	}
	
	@Test
	void selectUserById() {
		User user = userRep.findByUserId("test1");
		System.out.println(user);
	}
	
}
