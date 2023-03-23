package swcampus.mvc.service;

import java.util.List;

import swcampus.mvc.domain.Community;
import swcampus.mvc.dto.CommunityDTO;
import swcampus.mvc.dto.CommunityResponseDTO;

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
	Community selectByCommunityId(Long communityNo,Boolean state);
	/**
	 * 게시글 수정
	 * */
	void updateCommunity(Community community);
	/**
	 * 게시글 삭제
	 * */
	void deleteCommunity(Long CommunityNo);

}
