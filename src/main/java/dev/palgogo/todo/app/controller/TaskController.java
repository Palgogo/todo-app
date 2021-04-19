package dev.palgogo.todo.app.controller;

import dev.palgogo.todo.app.dto.CommentDto;
import dev.palgogo.todo.app.dto.CreateCommentRequest;
import dev.palgogo.todo.app.dto.CreateTaskRequest;
import dev.palgogo.todo.app.dto.TaskDetailsDto;
import dev.palgogo.todo.app.dto.TaskDto;
import dev.palgogo.todo.app.dto.UpdateAssigneeRequest;
import dev.palgogo.todo.app.dto.UpdateStatusRequest;
import dev.palgogo.todo.app.entity.TaskStatus;
import dev.palgogo.todo.app.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<TaskDto> createTask(
            @RequestPart(value = "files")
                    List<MultipartFile> files,
            @RequestPart CreateTaskRequest createTaskRequest
    ) {
        return ResponseEntity.ok(taskService.create(createTaskRequest, files));
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

    @PostMapping("/comment")
    public ResponseEntity<CommentDto> addComment(
            @RequestBody CreateCommentRequest createCommentRequest
    ){
        return ResponseEntity.ok(taskService.addComment(createCommentRequest));
    }

    @DeleteMapping("/comment")
    public ResponseEntity<Void> deleteComment(
            @RequestParam UUID commentId
    ){
        taskService.deleteComment(commentId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "{id}/details", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<TaskDetailsDto> getTaskDetails(
            @PathVariable UUID id
    ){
        return ResponseEntity.ok(taskService.getTaskDetails(id));
    }

    @GetMapping
    public ResponseEntity<Page<TaskDto>> getTasks(
            @RequestParam(value = "page", required = false, defaultValue = "0")
                    int page,
            @RequestParam(value = "size", required = false, defaultValue = "10")
                    int size,
            @RequestParam(required = false)
                    UUID departmentId,
            @RequestParam(required = false)
                    UUID userId,
            @RequestParam(value = "order", required = false, defaultValue = "ASC")
                    String order,
            @RequestParam(value = "status", required = false, defaultValue = "OPEN")
            TaskStatus status
    ){
        return ResponseEntity.ok(taskService.getTasks(departmentId, userId, status, order, page, size));
    }
}
