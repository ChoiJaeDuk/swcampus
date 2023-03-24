package swcampus.mvc.domain;



import java.time.LocalDate;
import java.time.LocalDateTime;

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

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Lecture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long lectureNo;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_no")
	private User user;
	
	@Column(nullable = false)
	private String lectureAgency;
	
	@Column(nullable = false)
	private String lectureTarget;
	
	@Column(nullable = false)
	private String lectureMethod;
	
	@Column(nullable = false)
	private String lectureTitle;
	
	@Column(nullable = false)
	private String lectureTeacher;
	
	@Lob
	private String lecture_classDetail;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime lectureStartDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime lectureEndDate;
	
	@CreationTimestamp
	private LocalDate lectureRegDate;
	
	@Column(nullable = false)
	private String lectureUrl;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_no")
	private Category category;
	
	
}

