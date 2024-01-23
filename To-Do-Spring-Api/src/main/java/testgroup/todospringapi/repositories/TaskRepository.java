package testgroup.todospringapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testgroup.todospringapi.models.Task;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
