package swcampus.mvc.dto;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swcampus.mvc.domain.Community;
import swcampus.mvc.domain.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommunityDTO {
    private static ModelMapper modelMapper = new ModelMapper();
    
    private Long communityNo;

	private Long userNo;
	
	private String communityTitle;
	
	private String communityContent;
		
	private LocalDateTime communityEditDate;
	
	private String communityCategory;
	
	private LocalDateTime communityRegDate;	  
	
	//public Community toEntity() {
	//	modelMapper.getConfiguration()
	//	.setFieldAccessLevel(AccessLevel.PRIVATE)
	//	.setFieldMatchingEnabled(true);
	//	return modelMapper.map(this, Community.class);
	// }
	
	
}
