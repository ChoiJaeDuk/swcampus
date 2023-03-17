package swcampus.mvc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NoticeImg {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "noticeImgNo_seq")
	@SequenceGenerator(name = "noticeImgNo_seq", allocationSize = 1, sequenceName = "noticeImgNo_seq")
	private Long noticeImgNo;
	
	@ManyToOne
	@JoinColumn(name = "notice_no")
	private Notice notice;
	
	@Column(nullable = false)
	private String oriNoticeImg;
	
}
