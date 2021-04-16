package dev.palgogo.todo.app.controller;

import dev.palgogo.todo.app.dto.CreateTaskRequest;
import dev.palgogo.todo.app.dto.TaskDto;
import dev.palgogo.todo.app.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tasks")
public class TaskController {

private final TaskService taskService;

    @PostMapping
    public ResponseEntity<TaskDto> createTask(
            @RequestBody CreateTaskRequest createTaskRequest
    ){
        return ResponseEntity.ok(taskService.create(createTaskRequest));
    }
}
