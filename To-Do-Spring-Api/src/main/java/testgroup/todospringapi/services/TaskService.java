package testgroup.todospringapi.services;

import testgroup.todospringapi.models.Task;

import java.util.List;

public interface TaskService {
    List<Task>getAllTasks();
    Task createTask(Task task);
    void deleteTaskById(Integer id);
    Task updateTask(Task task);
    void deleteAllTasks();
}
