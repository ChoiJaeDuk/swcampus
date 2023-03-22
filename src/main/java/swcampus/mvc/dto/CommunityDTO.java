package swcampus.mvc.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import swcampus.mvc.domain.Community;
import swcampus.mvc.domain.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunityDTO {
	
	private Long userNo;
	
	private String communityTitle;
	
	private String communityContent;
		
	private LocalDateTime communityEditDate;
	
	private String communityCategory;
	
	public Community toEntity(User user) {
		return Community.builder()
				.user(user)
				.communityTitle(communityTitle)
				.communityContent(communityContent)
				.communityEditDate(communityEditDate)
				.communityCategory(communityCategory)
				.build();
	}
	
}
