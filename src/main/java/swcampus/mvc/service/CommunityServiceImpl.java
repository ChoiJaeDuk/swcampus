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
		List<CommunityResponseDTO> l= dblist.stream()
				.map(c->toDTO(c))
				.collect(Collectors.toList());
		return  l;
	}

	@Override
	public void insertCommunity(CommunityDTO community) {
		
		User dbUser=userRep.findById(community.getUserNo()).get();
		Community comEntity =toEntity(community,dbUser);
		System.out.println(comEntity);
		communityRepository.save(comEntity);
	}

	@Override
	public CommunityResponseDTO selectByCommunityId(Long communityNo,Boolean state) {
		if(state) {
			communityRepository.countUpdate(communityNo);
		}
		Community dbCommunity=communityRepository.findById(communityNo).orElse(null);
		if(dbCommunity==null) {
			throw new RuntimeException("상세보기 오류에요 ") ;
		}
		
		CommunityResponseDTO dtoComm=toDTO(dbCommunity);
		System.out.println("서비스에서 dtoComm"+dtoComm);
		System.out.println("서비스에서 dtoComm"+dtoComm.getReplyList());
		return dtoComm;
	}

	@Override
	public void updateCommunity(CommunityDTO community) {
		Community dbcommunity = communityRepository.findById(community.getCommunityNo()).get();
		//Community dbcommunity = communityRepository.getReferenceById(community.getCommunityNo());
		dbcommunity.setCommunityContent(community.getCommunityContent());
		dbcommunity.setCommunityTitle(community.getCommunityTitle());
		dbcommunity.setCommunityEditDate(community.getCommunityEditDate());
	};
	@Override
	public void deleteCommunity(Long CommunityNo) {
		communityRepository.deleteById(CommunityNo);

	}

	@Override
	public void countUpdate(Long CommunityNo) {
		if(CommunityNo !=null) {
		communityRepository.countUpdate(CommunityNo);
		}
	}

}
