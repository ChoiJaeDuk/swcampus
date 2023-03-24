package swcampus.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swcampus.mvc.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
