package swcampus.mvc.service;

import java.util.List;

import org.springframework.data.domain.Page;

import swcampus.mvc.domain.User;
import swcampus.mvc.dto.user.UserRequestDTO;

public interface UserService {

	/**
	 * 회원가입
	 * @param user
	 */
	void userJoin(UserRequestDTO userDTO);
	
	/**
	 * 회원목록 조회
	 * @return
	 */
	//Page<UserResponseDTO> selectUserList(String orderby);
	
	
}
