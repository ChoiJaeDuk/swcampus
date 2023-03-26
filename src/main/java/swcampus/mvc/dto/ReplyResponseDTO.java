package swcampus.mvc.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplyResponseDTO {
	private Long communityNo;
	
	private String userName;
	
	private String replyContent;
	
	private LocalDateTime communityRegDate;
	
}