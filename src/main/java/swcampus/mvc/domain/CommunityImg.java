package swcampus.mvc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommunityImg {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "communityNo_seq")
	@SequenceGenerator(name = "communityNo_seq", allocationSize = 1, sequenceName = "communityNo_seq")
	private Long communityNo;
	
	@ManyToOne
	@JoinColumn(name = "community_no")
	private Community community;
	
	@Column(nullable = false)
	private String orCommunityImg;
	
}
