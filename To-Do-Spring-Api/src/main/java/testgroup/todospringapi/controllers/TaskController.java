package testgroup.todospringapi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import testgroup.todospringapi.models.Task;
import testgroup.todospringapi.services.TaskService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v0.1/tasks")
public class TaskController {
    private final TaskService service;
    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @PostMapping("create_task")
    public Task createTask(@RequestBody Task task) {
        return service.createTask(task);
    }

    @DeleteMapping("delete_task/{id}")
    public void deleteTaskById(@PathVariable Integer id) {
        service.deleteTaskById(id);
    }

    @PutMapping("update_task")
    public Task updateTask(@RequestBody Task task) {
        return service.updateTask(task);
    }

    @DeleteMapping("delete_all")
    public void deleteAllTasks() {
        service.deleteAllTasks();
    }
}
