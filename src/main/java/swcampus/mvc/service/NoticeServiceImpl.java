package swcampus.mvc.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import swcampus.mvc.domain.Notice;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.notice.NoticeDto;
import swcampus.mvc.repository.NoticeRepository;
import swcampus.mvc.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class NoticeServiceImpl implements NoticeService {

    private final NoticeRepository noticeRepository;
    private final UserRepository userRepository;

    /**
     * 등록
     */
    @Override
    @Transactional
    public Long insertNotice(NoticeDto noticeDto) {
        NoticeDto notice = new NoticeDto(noticeDto.getNoticeTitle(), noticeDto.getNoticeContent());
        Notice foundNotice = notice.transformToUser(notice);
        noticeRepository.save(foundNotice);

        return notice.getNoticeNo();
    }

    /**
     * 공지사항 하나
     */
    @Override
    public NoticeDto findNotice(Long id) {
        Notice notice = noticeRepository.getReferenceById(id);
        NoticeDto noticeDto = new NoticeDto();
        NoticeDto foundNoticeDto = noticeDto.transformToUseDto(notice);

        return foundNoticeDto;

    }

    @Override
    public List<NoticeDto> findAll() {
        NoticeDto noticeDto = new NoticeDto();
        List<Notice> notice = noticeRepository.findAll();
        List<NoticeDto> collect = notice.stream()
                                        .map(n -> noticeDto.transformToUseDto(n))
                                        .collect(Collectors.toList());

        return collect;
    }


    @Override
    @Transactional
    public void updateNotice(NoticeDto notice, NoticeDto noticeDto) {
        Notice foundNotice = noticeRepository.getReferenceById(notice.getNoticeNo());
        foundNotice.updateNotice(noticeDto);
    }
}
