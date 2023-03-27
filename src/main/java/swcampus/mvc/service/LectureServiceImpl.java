package swcampus.mvc.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.domain.Category;
import swcampus.mvc.domain.Community;
import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.CommunityResponseDTO;
import swcampus.mvc.dto.LectureDTO;
import swcampus.mvc.dto.LectureResponseDTO;
import swcampus.mvc.repository.CategoryRepository;
import swcampus.mvc.repository.LectureRepository;
import swcampus.mvc.repository.UserRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class LectureServiceImpl implements LectureService {
	
	@Autowired 
	private LectureRepository lectureRep;
	
	@Autowired 
	private UserRepository userRep; 
	
	@Autowired
	private CategoryRepository cateRep;

	@Override
	public List<Lecture> selectAll() {
		
	return lectureRep.findAll(Sort.by(Sort.Direction.DESC, "lectureNo"));
	}

	@Override
	public LectureResponseDTO selectByLectureNo(Long LectureNo) {
		Lecture dblec = lectureRep.getReferenceById(LectureNo);
		System.out.println(dblec);
		LectureResponseDTO dto = toDto(dblec);
		System.out.println(dto);
		return dto;
	}
	
	@Override
	public void insertLecture(LectureDTO lectureDto) {
		User dbUser=userRep.findById(lectureDto.getUserNo()).orElse(null);
		Category dbCate=cateRep.findById(lectureDto.getCategoryNo()).orElse(null);
    		System.out.println("서비스에서 "+dbUser);
    		System.out.println("서비스에서 "+dbCate);
		Lecture lecture =toEntity(lectureDto, dbUser, dbCate);
			System.out.println("서비스에서 "+lecture);
		lectureRep.save(lecture); 
		
	}

	@Override
	public void deleteByLectureNo(Long LectureNo) {
		lectureRep.deleteById(LectureNo);
		
	}

	@Override
	public void updateLecture(LectureDTO lectureDto) {
		Lecture dbLecture = lectureRep.getReferenceById(lectureDto.getLectureNo());
		Category dbcate = cateRep.getReferenceById(lectureDto.getCategoryNo());
		
		dbLecture.setLectureAgency(lectureDto.getLectureAgency());
		dbLecture.setLectureTarget(lectureDto.getLectureTarget());
		dbLecture.setLectureMethod(lectureDto.getLectureMethod());
		dbLecture.setCategory(dbcate);
		dbLecture.setLectureTitle(null);
		dbLecture.setLectureTeacher(null);
	}
	

	
}
