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

    Long insertNotice(NoticeDto noticeDto);

    List<NoticeDto> findAll();

    NoticeDto findNotice(Long id);


    void updateNotice(NoticeDto notice, NoticeDto noticeDto);



//    default Notice toEntity(NoticeDto noticeDto) {
//        return Notice.builder()
//                .noticeTitle(noticeDto.getNoticeTitle())
//                .noticeContent(noticeDto.getNoticeContent())
//                .noticeEditDate(LocalDate.now())
//                .noticeViewCount(noticeDto.getNoticeViewCount())
//                .build();
//    }
//
//
//
//    default NoticeDto toDto(Notice notice) {
//        return NoticeDto.builder()
//                .noticeTitle(notice.getNoticeTitle())
//                .noticeContent(notice.getNoticeContent())
//                .noticeEditDate(LocalDate.now())
//                .build();
//    }

}
