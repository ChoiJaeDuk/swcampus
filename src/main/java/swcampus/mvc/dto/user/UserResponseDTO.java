package swcampus.mvc.dto.user;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDTO {
	private Long userNo;
	
	private String userId;
	
	private String userName;
	
	private String userPhone;
	
	private String userEmail;
	
	private LocalDateTime userRegDate;
	
}
