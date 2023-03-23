package swcampus.mvc.service;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.Role;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.page.PageRequestDTO;
import swcampus.mvc.dto.page.PageResponseDTO;
import swcampus.mvc.dto.user.UserRequestDTO;
import swcampus.mvc.dto.user.UserResponseDTO;
import swcampus.mvc.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRep;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public void userJoin(UserRequestDTO userDTO) {
		User user =  toEntity(userDTO);
		String encoderPwd = bCryptPasswordEncoder.encode(userDTO.getUserPassword());
		user.setUserRole(Role.ROLE_USER);
		user.setUserPassword(encoderPwd);
		userRep.save(user);
	}

	@Override
	public void userDelete(Long userNo) {
		
		
		userRep.deleteById(userNo);
	}
	
	
	@Override
	public PageResponseDTO<UserResponseDTO, User> selectUserList(PageRequestDTO requestDTO) {
		Pageable pageable = requestDTO.getPageable(Sort.by("userNo"));
		
		Page<User> result = userRep.findAll(pageable);
		
		Function<User, UserResponseDTO> fn = (entity -> toDTO(entity));
		
		return new PageResponseDTO<>(result, fn);
	}
}