package swcampus.mvc.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "noticeNo_seq")
	@SequenceGenerator(name = "noticeNo_seq", allocationSize = 1, sequenceName = "noticeNo_seq")
	private Long noticeNo;
	
	@ManyToOne
	@JoinColumn(name = "user_no")
	private User user;
	
	@Column(nullable = false)
	private String noticeTitle;
	
	@Column(nullable = true)
	private String noticeContent;

	@CreationTimestamp
	private LocalDate notieEditDate;
	
	@Column(nullable = false)
	private int noticeViewCount;
	
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryNo")
	private NoticeImg noticeImg;


}
