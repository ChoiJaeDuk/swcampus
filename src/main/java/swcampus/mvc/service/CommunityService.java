package swcampus.mvc.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import swcampus.mvc.domain.Community;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.CommunityDTO;
import swcampus.mvc.dto.CommunityResponseDTO;
import swcampus.mvc.dto.ReplyResponseDTO;

public interface CommunityService {
	
	
	
	/**
	 * 카테고르별 게시글 전체조회
	 * */
	List<CommunityResponseDTO> communityList(String communityCategory);
	/**
	 * 게시글 등록
	 * */
	void insertCommunity(CommunityDTO community);
	/**
	 * 게시글 상세조회
	 * */
	CommunityResponseDTO selectByCommunityId(Long communityNo,Boolean state);
	/**
	 * 게시글 수정
	 * */
	void updateCommunity(CommunityDTO community);
	/**
	 * 게시글 삭제
	 * */
	void deleteCommunity(Long CommunityNo);
	/**
	 * 조회수증가
	 * */
	void countUpdate(Long CommunityNo);
	
	default  CommunityResponseDTO toDTO (Community community) {
		return CommunityResponseDTO.builder()
			.communityNo(community.getCommunityNo())
			.userName(community.getUser().getUserName())
			.communityTitle(community.getCommunityTitle())
			.communityContent(community.getCommunityContent())
			.communityEditDate(community.getCommunityEditDate())
			.communityCategory(community.getCommunityCategory())
			.communityRegDate(community.getCommunityRegDate())
			.communityCount(community.getCommunityCount())
			.replyList(community.getReplyList().stream()
					.map(ReplyResponseDTO::new).collect(Collectors.toList()))	
			.build();
	}	
	default Community toEntity(CommunityDTO commDto, User user) { 
		 return Community.builder()
				  .user(user) 
				  .communityTitle(commDto.getCommunityTitle())
				  .communityContent(commDto.getCommunityContent()) 
				  .communityEditDate(commDto.getCommunityEditDate())
				  .communityCategory(commDto.getCommunityCategory()) 
				  .build(); 
			  }	
	}


