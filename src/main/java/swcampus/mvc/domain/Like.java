package swcampus.mvc.domain;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Like {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "likeNo_seq")
	@SequenceGenerator(name = "likeNo_seq", allocationSize = 1, sequenceName = "likeNo_seq")
	private Long likeNo;	

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lecture_no")
	private Lecture lecture;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
}
