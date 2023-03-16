package swcampus.mvc;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import swcampus.mvc.domain.test;
import swcampus.mvc.repository.TestRepository;

@SpringBootTest
@Commit
@Transactional
class SwcampusApplicationTests {

	@Autowired
	private TestRepository testrepository;
	
	@Test
	void contextLoads() {
		for (int i =1; i<= 4; i++) {
			testrepository.save(new test(i+"연동 되나용 넣기 "));
		}
	}

}
