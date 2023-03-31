package swcampus.mvc.domain;

import java.time.LocalDate;

import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import swcampus.mvc.dto.notice.NoticeDto;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long noticeNo;

	private String noticeTitle;
	
	private String noticeContent;

	private LocalDate noticeEditDate;
	
	private int noticeViewCount;

	// == update == //
	public void updateNotice(NoticeDto noticeDto) {
		this.noticeTitle = noticeDto.getNoticeTitle();
		this.noticeContent = noticeDto.getNoticeContent();
		this.noticeEditDate = LocalDate.now();
	}

}
