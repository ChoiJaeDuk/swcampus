package swcampus.mvc.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Reply {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "replyNo_seq")
	@SequenceGenerator(name = "replyNo_seq", allocationSize = 1, sequenceName = "replyNo_seq")
	private Long replyNo;	

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "community_no")
	private Community community;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(nullable = false)
	private String replyContent;
	
	@CreationTimestamp
	private LocalDate replyRegDate;
	

}
