package swcampus.mvc.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import swcampus.mvc.domain.Community;
import swcampus.mvc.domain.Reply;
import swcampus.mvc.domain.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {
	private Long communityNo;
	
	private Long userNo;
	
	private String replyContent;
	
	
}
