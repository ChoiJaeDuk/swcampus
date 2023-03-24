package swcampus.mvc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.domain.Community;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.CommunityDTO;
import swcampus.mvc.dto.CommunityResponseDTO;
import swcampus.mvc.repository.CommunityRepository;
import swcampus.mvc.repository.UserRepository;
@Service
@Transactional
@RequiredArgsConstructor
public class CommunityServiceImpl implements CommunityService {
	
	private final CommunityRepository communityRepository ; 
	private final UserRepository userRep;
	
	
	@Override
	public List<CommunityResponseDTO> communityList(String communityCategory) {
		
		List<Community> dblist= communityRepository.findByCommunityCategory(communityCategory);
		System.out.println("컨트롤러에서 "+dblist);
		List<CommunityResponseDTO> l= dblist.stream()
				.map(c->toDTO(c))
				.collect(Collectors.toList());
		System.out.println("컨트롤러에서 "+l);

		return  l;
	}

	@Override
	public void insertCommunity(CommunityDTO community) {
		User dbUser=userRep.findById(community.getUserNo()).orElse(null);
		Community comEntity =toEntity(community,dbUser);
		
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
