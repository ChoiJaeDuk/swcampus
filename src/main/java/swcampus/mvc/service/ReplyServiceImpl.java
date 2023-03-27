package swcampus.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.domain.Community;
import swcampus.mvc.domain.Reply;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.ReplyDTO;
import swcampus.mvc.repository.CommunityRepository;
import swcampus.mvc.repository.ReplyRepository;
import swcampus.mvc.repository.UserRepository;
@Service
@Transactional
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {
	
	private final ReplyRepository replyRepository;
	private final CommunityRepository communityRepository ; 
	private final UserRepository userRep;

	
	@Override
	public List<Reply> replyList(Long CommunityNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertReply(ReplyDTO replyDto) {
		Community dbComm=communityRepository.getReferenceById(replyDto.getCommunityNo());
		User dbUser=userRep.getReferenceById(replyDto.getUserNo());
		Reply reEntity=toEntity(replyDto, dbComm, dbUser);
		
		
		//communityRepository.countUpdate(replyDto.getCommunityNo());
		replyRepository.save(reEntity);
	}

	@Override
	public void deleteReply(Long replyNo) {
		replyRepository.deleteById(replyNo);
	}

}
