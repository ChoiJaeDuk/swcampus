package swcampus.mvc.dto.page;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import lombok.Data;

@Data
public class PageResponseDTO<DTO, EN>{
	private List<DTO> dtoList;
	
	public PageResponseDTO(Page<EN> result, Function<EN, DTO> fn) {
		
		dtoList = result.stream().map(fn).collect(Collectors.toList());
	}
}
