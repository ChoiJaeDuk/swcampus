package swcampus.mvc.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import swcampus.mvc.domain.User;

@Data
@Builder
@AllArgsConstructor
public class CommunityResponseDTO {
	private String userName;
	
	private String communityTitle;
	
	private String communityContent;
		
	private LocalDateTime communityEditDate;
	
	private String communityCategory;
	
	
}
