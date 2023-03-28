package swcampus.mvc.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import swcampus.mvc.domain.Community;
import swcampus.mvc.domain.Reply;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplyResponseDTO {
	
	private Long communityNo;
	
	private String userName;
	
	private String replyContent;
	
	private LocalDate replyRegDate;
	
	/* Entity -> Dto*/
	public ReplyResponseDTO(Reply re) {
		this.communityNo = re.getCommunity().getCommunityNo();
		this.userName=re.getUser().getUserName();
		this.replyContent=re.getReplyContent();	
		this.replyRegDate=re.getReplyRegDate();
	}
	
}