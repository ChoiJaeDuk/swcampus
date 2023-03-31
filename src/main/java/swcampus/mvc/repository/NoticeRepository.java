package swcampus.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swcampus.mvc.domain.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
