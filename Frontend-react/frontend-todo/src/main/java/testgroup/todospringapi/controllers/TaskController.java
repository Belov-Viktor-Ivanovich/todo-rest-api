package testgroup.todospringapi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import testgroup.todospringapi.models.Task;
import testgroup.todospringapi.services.TaskService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v0.1")
@CrossOrigin("http://localhost:3000/")
public class TaskController {
    private final TaskService service;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @PostMapping("/task")
    public Task createTask(@RequestBody Task task) {
        return service.createTask(task);
    }

    @DeleteMapping("/task/{id}")
    public void deleteTaskById(@PathVariable Integer id) {
        service.deleteTaskById(id);
    }

    @PutMapping("/task")
    public Task updateTask(@RequestBody Task task) {
        return service.updateTask(task);
    }

    @DeleteMapping("/tasks")
    public void deleteAllTasks() {
        service.deleteAllTasks();
    }
}
