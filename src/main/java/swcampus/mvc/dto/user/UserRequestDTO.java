package swcampus.mvc.dto.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import swcampus.mvc.domain.User;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserRequestDTO {
	private Long userNo;
	
	private String userId;
	
	private String userEmail;
	
	private String userName;
	
	private String userPassword;
	
	private String userCompany;
	
	private String userJob;
	
	
	public User toEntity() {
		User user = User.builder()
				.userId(userId)
				.userEmail(userEmail)
				.userName(userName)
				.userPassword(userPassword)
				.userCompany(userCompany)
				.userJob(userJob).build();
		return user;
	}

}
