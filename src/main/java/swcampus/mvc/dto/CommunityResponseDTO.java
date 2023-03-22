package swcampus.mvc.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import swcampus.mvc.domain.Community;

@Data
@Builder
public class CommunityResponseDTO {
	private String userName;
	
	private String communityTitle;
	
	private String communityContent;
		
	private LocalDateTime communityEditDate;
	
	private String communityCategory;
	
	public CommunityResponseDTO toDTO () {
		return CommunityResponseDTO.builder()
			.userName(userName)
			.communityTitle(communityTitle)
			.communityContent(communityContent)
			.communityEditDate(communityEditDate)
			.communityCategory(communityCategory)
			.build();
	}
	
}
