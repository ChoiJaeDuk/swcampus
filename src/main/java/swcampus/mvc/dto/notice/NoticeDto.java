package swcampus.mvc.dto.notice;

import lombok.*;
import swcampus.mvc.domain.Notice;
import swcampus.mvc.domain.User;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NoticeDto {

    private Long noticeNo;

    @NotEmpty(message = "제목을 입력해주세요.")
    private String noticeTitle;

    @NotEmpty(message = "내용을 입력해주세요.")
    @Size(min = 30, max = 1000)
    private String noticeContent;

    private LocalDate noticeEditDate;

    private int noticeViewCount;

    private User user;

}
