package swcampus.mvc.domain;

import java.time.LocalDate;

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
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long noticeNo;
	
	@ManyToOne
	@JoinColumn(name = "user_no")
	private User user;
	
	private String noticeTitle;
	
	private String noticeContent;

	@CreationTimestamp
	private LocalDate noticeEditDate;
	
	private int noticeViewCount;

	// == 생성 메서드 == //
	public void createNotice(NoticeDto noticeDto) {
		this.user = user;
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.noticeEditDate = LocalDate.now();

	}
	
}
