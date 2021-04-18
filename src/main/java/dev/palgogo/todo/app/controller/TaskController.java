package dev.palgogo.todo.app.controller;

import dev.palgogo.todo.app.dto.CreateTaskRequest;
import dev.palgogo.todo.app.dto.TaskDto;
import dev.palgogo.todo.app.dto.UpdateAssigneeRequest;
import dev.palgogo.todo.app.dto.UpdateStatusRequest;
import dev.palgogo.todo.app.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<TaskDto> createTask(
            @RequestBody CreateTaskRequest createTaskRequest
    ) {
        return ResponseEntity.ok(taskService.create(createTaskRequest));
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Void> updateStatus(
            @PathVariable UUID id,
            @RequestBody UpdateStatusRequest updateStatusRequest
    ) {
        taskService.updateStatus(id, updateStatusRequest);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/asignee")
    public ResponseEntity<Void> updateAssignee(
            @PathVariable UUID id,
            @RequestBody UpdateAssigneeRequest updateAssigneeRequest
    ) {
        taskService.updateAssignee(id, updateAssigneeRequest);
        return ResponseEntity.noContent().build();
    }
}
