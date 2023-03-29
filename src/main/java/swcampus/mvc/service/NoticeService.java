package swcampus.mvc.service;

import swcampus.mvc.domain.Community;
import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.Notice;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.CommunityDTO;
import swcampus.mvc.dto.CommunityResponseDTO;
import swcampus.mvc.dto.LectureResponseDTO;
import swcampus.mvc.dto.notice.NoticeDto;

import java.time.LocalDate;
import java.util.List;

public interface NoticeService {

    void insertNotice(NoticeDto noticeDto);

    List<NoticeDto> findAll();

    NoticeDto findNotice(Long id);


    void updateNotice(NoticeDto noticeDto);



    default Notice toEntity(NoticeDto noticeDto, User user) {
        return Notice.builder()
                .user(user)
                .noticeTitle(noticeDto.getNoticeTitle())
                .noticeContent(noticeDto.getNoticeContent())
                .noticeEditDate(LocalDate.now())
                .build();
    }



    default NoticeDto toDto(Notice notice) {
        return NoticeDto.builder()
                .noticeTitle(notice.getNoticeTitle())
                .noticeContent(notice.getNoticeContent())
                .noticeEditDate(LocalDate.now())
                .build();
    }

}
