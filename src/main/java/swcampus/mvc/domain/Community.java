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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.ColumnDefault;
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
@Setter
@Getter
@Builder
@RequiredArgsConstructor
@ToString
public class Community {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long communityNo;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_no")
	private User user;
	
	@Column(nullable = false)
	private String communityTitle;
	
	@Column(nullable = false)
	@Lob
	private String communityContent;
	
	@CreationTimestamp
	private LocalDateTime communityRegDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm")
	private LocalDateTime communityEditDate;
	
	@ColumnDefault("0")
	private int communityCount;
	
	@Column(nullable = false)
	private String communityCategory;
	
}
