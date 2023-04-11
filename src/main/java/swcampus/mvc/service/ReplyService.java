package swcampus.mvc.service;

import java.util.List;

import swcampus.mvc.domain.Community;
import swcampus.mvc.domain.Reply;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.ReplyDTO;

public interface ReplyService {

	/**
	 * 커뮤니티글번호에 따른 댓글 전체조회
	 * */
	List<Reply> replyList(Long CommunityNo);
	/**
	 * 댓글 등록
	 * */
	void insertReply(ReplyDTO replyDto);
	/**
	 * 댓글 삭제 
	 * */
	void deleteReply(Long replyNo);
	
	
	default Reply toEntity(ReplyDTO replyDTO, Community comm, User user) {
		return Reply.builder()
				.community(comm)
				.user(user)
				.replyContent(replyDTO.getReplyContent())
				.build();
	}
}
