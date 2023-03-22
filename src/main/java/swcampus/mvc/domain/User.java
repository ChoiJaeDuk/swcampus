package swcampus.mvc.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;

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
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userNo;
	
	@Column(nullable = false)
	private String userId;
	
	@Column(nullable = false)
	private String userEmail;
	
	@Column(nullable = false)
	private String userName;
	
	@Column(nullable = false)
	private String userPassword;
	
	private String userCompany;
	
	private String userJob;
	
	@CreationTimestamp
	private LocalDateTime userRegDate;
}
