package swcampus.mvc.dto.notice;

import lombok.*;
import swcampus.mvc.domain.Notice;
import swcampus.mvc.domain.User;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class NoticeDto {

    private Long noticeNo;

    @NotEmpty(message = "제목을 입력해주세요.")
    private String noticeTitle;

    @NotEmpty(message = "내용을 입력해주세요.")
//    @Size(min = 30, max = 1000)
    private String noticeContent;

    private LocalDate noticeEditDate;

    private int noticeViewCount;

    public NoticeDto(String noticeTitle, String noticeContent) {
        this.noticeTitle = noticeTitle;
        this.noticeContent = noticeContent;
    }

    public Notice transformToUser(NoticeDto noticeDto) {
        return Notice.builder()
                .noticeTitle(noticeDto.getNoticeTitle())
                .noticeContent(noticeDto.getNoticeContent())
                .noticeEditDate(LocalDate.now())
                .build();
    }

    public NoticeDto transformToUseDto(Notice notice) {
        return NoticeDto.builder()
                .noticeTitle(notice.getNoticeTitle())
                .noticeContent(notice.getNoticeContent())
                .noticeEditDate(LocalDate.now())
                .build();
    }


}
