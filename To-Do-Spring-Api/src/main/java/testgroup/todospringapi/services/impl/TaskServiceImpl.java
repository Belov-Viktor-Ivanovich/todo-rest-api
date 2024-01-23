package testgroup.todospringapi.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import testgroup.todospringapi.models.Task;
import testgroup.todospringapi.repositories.TaskRepository;
import testgroup.todospringapi.services.TaskService;

import java.util.List;
@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {
    private TaskRepository repository;
    @Override
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    @Override
    public Task createTask(Task task) {
        return repository.save(task);
    }

    @Override
    public void deleteTaskById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Task updateTask(Task task) {
        return repository.save(task);
    }

    @Override
    public void deleteAllTasks() {
        repository.deleteAll();
    }
}
