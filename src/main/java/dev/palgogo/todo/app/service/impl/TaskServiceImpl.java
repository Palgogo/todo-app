package dev.palgogo.todo.app.service.impl;

import dev.palgogo.todo.app.dto.CreateTaskRequest;
import dev.palgogo.todo.app.dto.TaskDto;
import dev.palgogo.todo.app.entity.TaskStatus;
import dev.palgogo.todo.app.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public TaskDto create(CreateTaskRequest createTaskRequest) {
        //todo add impl
        return TaskDto.builder()
                .createdAt(Instant.MIN)
                .id(UUID.randomUUID())
                .status(TaskStatus.OPEN)
                .build();
    }
}
