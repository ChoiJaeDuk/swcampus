package swcampus.mvc.service;

import swcampus.mvc.domain.User;
import swcampus.mvc.dto.page.PageRequestDTO;
import swcampus.mvc.dto.page.PageResponseDTO;
import swcampus.mvc.dto.user.UserRequestDTO;
import swcampus.mvc.dto.user.UserResponseDTO;

public interface UserService {
	
	default UserResponseDTO toDTO(User user) {
		return UserResponseDTO.builder()
				.userNo(user.getUserNo())
				.userId(user.getUserId())
				.userEmail(user.getUserEmail())
				.userName(user.getUserName())
				.userPhone(user.getUserPhone())
				.userRegDate(user.getUserRegDate())
				.userCompany(user.getUserCompany())
				.userJob(user.getUserJob())
				.build();
	}
	
	
	
	default User toEntity(UserRequestDTO userDTO) {
		User user = User.builder()
				.userId(userDTO.getUserId())
				.userEmail(userDTO.getUserEmail())
				.userName(userDTO.getUserName())
				.userPassword(userDTO.getUserPassword())
				.userPhone(userDTO.getUserPhone())
				.userCompany(userDTO.getUserCompany())
				.userJob(userDTO.getUserJob())
				.build();
		return user;
		
	}

	/**
	 * 회원가입
	 * @param user
	 */
	void userJoin(UserRequestDTO userDTO);
	
	/**
	 * 회원정보 수정
	 * @param userDTO
	 */
	void userUpdate(UserRequestDTO userDTO);
	
	/**
	 * 회원번호를 전달받아 회원을 삭제한다.(회원탈퇴)
	 * */
	void userDelete(Long userNo);
	
	/**
	 * 회원번호에 해당하는 회원정보 반환
	 * @param userNo
	 * @return
	 */
	UserResponseDTO userSelectById(Long userNo);
	
	/**
	 * 회원목록 조회
	 * @return
	 */
	PageResponseDTO<UserResponseDTO, User> selectUserList(PageRequestDTO requestDTO);
	
	/**
	 * 아이디 중복확인
	 * @param id
	 * @return
	 */
	int idCheck(String id);
	
	
}
