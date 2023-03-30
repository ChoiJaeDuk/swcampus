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
public class NoticeServiceImpl implements NoticeService{

    private final NoticeRepository noticeRepository;
    private final UserRepository userRepository;

    /**
     * 등록
     */
    @Override
    @Transactional
    public void insertNotice(NoticeDto noticeDto) {
        User user = userRepository.getReferenceById(noticeDto.getNoticeNo());
        Notice notice = toEntity(noticeDto, user);
        noticeRepository.save(notice);
    }

    /**
     * 공지사항 하나
     */
    @Override
    public NoticeDto findNotice(Long id) {
        Notice referenceById = noticeRepository.getReferenceById(id);
        log.info("referenceById={}", referenceById);
        return toDto(referenceById);

    }

    @Override
    public List<NoticeDto> findAll() {
        List<Notice> notice = noticeRepository.findAll();
        List<NoticeDto> collect = notice.stream()
                                        .map(n -> toDto(n))
                                        .collect(Collectors.toList());

        return collect;
    }


    @Override
    @Transactional
    public void updateNotice(NoticeDto noticeDto) {
        Notice notice = noticeRepository.getReferenceById(noticeDto.getNoticeNo());
        notice.createNotice(noticeDto);

    }
}
