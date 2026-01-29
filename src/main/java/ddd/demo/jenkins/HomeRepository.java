package ddd.demo.jenkins;

import ddd.demo.jenkins.model.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Home, Long> {
}
