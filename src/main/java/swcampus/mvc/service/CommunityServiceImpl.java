package swcampus.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.domain.Community;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.CommunityDTO;
import swcampus.mvc.dto.CommunityResponseDTO;
import swcampus.mvc.repository.CommunityRepository;
@Service
@Transactional
@RequiredArgsConstructor
public class CommunityServiceImpl implements CommunityService {
	
	private final CommunityRepository communityRepository ; 
	
	
	@Override
	public List<CommunityResponseDTO> communityList(String communityCategory) {
		//List<CommunityResponseDTO>
		//communityRepository.findByCommunityCategory(communityCategory);
		return null; 
	}

	@Override
	public void insertCommunity(CommunityDTO community) {
		Community comEntity =community.toEntity(new User (community.getUserNo()));
		communityRepository.save(comEntity);
	}

	@Override
	public Community selectByCommunityId(Long communityNo,Boolean state) {
		if(state) {
			communityRepository.countUpdate(communityNo);
		}
		Community dbCommunity=communityRepository.findById(communityNo).orElse(null);
		return dbCommunity;
	}

	@Override
	public void updateCommunity(Community community) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCommunity(Long CommunityNo) {
		communityRepository.deleteById(CommunityNo);

	}

}
