package swcampus.mvc.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.user.UserRequestDTO;
import swcampus.mvc.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRep;
	
	@Override
	public void userJoin(UserRequestDTO userDTO) {
		
		User user = userDTO.toEntity();
		
		userRep.save(user);
	}
	
//	@Override
//	public Page<UserResponseDTO> selectUserList(String orderby) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
