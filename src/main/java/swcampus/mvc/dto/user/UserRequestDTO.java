package swcampus.mvc.dto.user;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import swcampus.mvc.domain.Role;
import swcampus.mvc.domain.User;

@ToString
@Data
@Builder
@AllArgsConstructor
public class UserRequestDTO {
	private Long userNo;
	
	private String userId;
	
	private String userEmail;
	
	private String userName;
	
	private String userPhone;
	
	private String userPassword;
	
	private Role userRole;
	
	private String userCompany;
	
	private String userJob;


}
