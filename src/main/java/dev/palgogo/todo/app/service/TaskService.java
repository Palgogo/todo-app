package dev.palgogo.todo.app.service;

import dev.palgogo.todo.app.dto.CommentDto;
import dev.palgogo.todo.app.dto.CreateCommentRequest;
import dev.palgogo.todo.app.dto.CreateTaskRequest;
import dev.palgogo.todo.app.dto.TaskDetailsDto;
import dev.palgogo.todo.app.dto.TaskDto;
import dev.palgogo.todo.app.dto.UpdateAssigneeRequest;
import dev.palgogo.todo.app.dto.UpdateStatusRequest;
import dev.palgogo.todo.app.entity.TaskStatus;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    TaskDto create(CreateTaskRequest createTaskRequest, List<MultipartFile> files);

    void updateStatus(UUID id, UpdateStatusRequest updateStatusRequest);

    void updateAssignee(UUID id, UpdateAssigneeRequest updateAssigneeRequest);

    CommentDto addComment(CreateCommentRequest createCommentRequest);

    void deleteComment(UUID id);

    TaskDetailsDto getTaskDetails(UUID id);

    Page<TaskDto> getTasks(UUID departmentId, UUID userId, TaskStatus status, String order, int page, int size);
}
