package swcampus.mvc.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CommunityResponseDTO {
	
	private String userName;
	
	private String communityTitle;
	
	private String communityContent;
		
	private LocalDateTime communityEditDate;
	
	private LocalDateTime communityRegDate;
	
	private String communityCategory;
	
	
	private List<ReplyResponseDTO> replyList;
	
}
