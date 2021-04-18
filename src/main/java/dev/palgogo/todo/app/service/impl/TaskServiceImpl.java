package dev.palgogo.todo.app.service.impl;

import dev.palgogo.todo.app.dto.CreateTaskRequest;
import dev.palgogo.todo.app.dto.TaskDto;
import dev.palgogo.todo.app.dto.UpdateStatusRequest;
import dev.palgogo.todo.app.entity.TaskEntity;
import dev.palgogo.todo.app.entity.TaskStatus;
import dev.palgogo.todo.app.mapper.TaskMapper;
import dev.palgogo.todo.app.repository.TaskRepository;
import dev.palgogo.todo.app.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskMapper taskMapper;
    private final TaskRepository taskRepository;

    @Override
    public TaskDto create(CreateTaskRequest createTaskRequest) {
        TaskEntity entity = taskMapper.toTaskEntity(createTaskRequest);
        TaskEntity taskEntity = save(entity);

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

    private TaskEntity save(TaskEntity entity) {
        entity.setStatus(TaskStatus.OPEN);

        return taskRepository.save(entity);
    }
}
