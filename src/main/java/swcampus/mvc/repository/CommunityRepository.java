package swcampus.mvc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import swcampus.mvc.domain.Community;

public interface CommunityRepository extends JpaRepository<Community, Long>, QuerydslPredicateExecutor<Community> {
	
	List<Community> findByCommunityCategory(String communityCategory);
	
	//조회수증가
	@Query("update Community c set c.communityCount=c.communityCount+1 where c.communityNo=?1")
	@Modifying
	void countUpdate(Long communityNo);
	
}
