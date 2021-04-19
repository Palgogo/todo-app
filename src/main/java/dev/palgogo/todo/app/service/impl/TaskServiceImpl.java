package dev.palgogo.todo.app.service.impl;

import dev.palgogo.todo.app.dto.CommentDto;
import dev.palgogo.todo.app.dto.CreateCommentRequest;
import dev.palgogo.todo.app.dto.CreateTaskRequest;
import dev.palgogo.todo.app.dto.TaskDetailsDto;
import dev.palgogo.todo.app.dto.TaskDto;
import dev.palgogo.todo.app.dto.UpdateAssigneeRequest;
import dev.palgogo.todo.app.dto.UpdateStatusRequest;
import dev.palgogo.todo.app.entity.CommentEntity;
import dev.palgogo.todo.app.entity.TaskEntity;
import dev.palgogo.todo.app.entity.TaskStatus;
import dev.palgogo.todo.app.mapper.TaskMapper;
import dev.palgogo.todo.app.repository.CommentRepository;
import dev.palgogo.todo.app.repository.TaskRepository;
import dev.palgogo.todo.app.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskMapper taskMapper;
    private final TaskRepository taskRepository;
    private final CommentRepository commentRepository;

    @Override
    public TaskDto create(CreateTaskRequest createTaskRequest, List<MultipartFile> files) {
        TaskEntity entity = taskMapper.toTaskEntity(createTaskRequest);
        TaskEntity taskEntity = save(entity);
//save files
        return taskMapper.toTaskDto(taskEntity);
    }

    @Override
    public void updateStatus(UUID id, UpdateStatusRequest updateStatusRequest) {
        Optional<TaskEntity> entityOptional = taskRepository.findById(id);
        entityOptional.ifPresent(taskEntity -> {
            taskEntity.setStatus(updateStatusRequest.getStatus());
            taskRepository.save(taskEntity);
        });
    }

    @Override
    public void updateAssignee(UUID id, UpdateAssigneeRequest updateAssigneeRequest) {
        Optional<TaskEntity> entityOptional = taskRepository.findById(id);
        entityOptional.ifPresent(taskEntity -> {
            taskEntity.setAssigneeId(updateAssigneeRequest.getAssigneeId());
            taskRepository.save(taskEntity);
        });
    }

    @Override
    public CommentDto addComment(CreateCommentRequest createCommentRequest) {
            CommentEntity commentEntity = new CommentEntity();
            commentEntity.setTaskId(createCommentRequest.getTaskId());
            commentEntity.setAuthorId(createCommentRequest.getAuthorId());
            commentEntity.setText(createCommentRequest.getComment());
        CommentEntity entity = commentRepository.save(commentEntity);
        //should return taskDto with comment
        //map value
        return new CommentDto();
    }

    @Override
    public void deleteComment(UUID id) {
        //check if can delete
        commentRepository.deleteById(id);
    }

    @Override
    public TaskDetailsDto getTaskDetails(UUID id) {
        return new TaskDetailsDto();
    }

    @Override
    public Page<TaskDto> getTasks(UUID departmentId, UUID userId, TaskStatus status, String order, int page, int size) {
        //get tasks by department and status or user and status
        //get user rating and update dto
        //return needed
        return Page.empty();
    }

    private TaskEntity save(TaskEntity entity) {
        entity.setStatus(TaskStatus.OPEN);

        return taskRepository.save(entity);
    }
}
