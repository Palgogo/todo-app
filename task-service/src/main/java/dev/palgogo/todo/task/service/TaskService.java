package dev.palgogo.todo.task.service;

import dev.palgogo.todo.task.dto.CommentDto;
import dev.palgogo.todo.task.dto.CreateCommentRequest;
import dev.palgogo.todo.task.dto.CreateTaskRequest;
import dev.palgogo.todo.task.dto.TaskDetailsDto;
import dev.palgogo.todo.task.dto.TaskDto;
import dev.palgogo.todo.task.dto.UpdateAssigneeRequest;
import dev.palgogo.todo.task.dto.UpdateStatusRequest;
import dev.palgogo.todo.task.entity.TaskStatus;
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
