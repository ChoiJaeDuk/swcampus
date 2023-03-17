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

public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reviewNo_seq")
	@SequenceGenerator(name = "reviewNo_seq", allocationSize = 1, sequenceName = "reviewNo_seq")
	private Long reviewNo;	

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lecture_no")
	private Lecture lecture;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_no")
	private User user;
	
	@CreationTimestamp
	private LocalDate reviewRegDate;
	
	@Column(nullable = false)
	private double reviewStar;
	
	@Column(nullable = false)
	private String replyContent;
	
	@Column(nullable = false)
	private boolean reviewCheck;

	@Column(nullable = false)
	private String reviewImg;

}

