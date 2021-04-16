package dev.palgogo.todo.app.service;

import dev.palgogo.todo.app.dto.CreateTaskRequest;
import dev.palgogo.todo.app.dto.TaskDto;

public interface TaskService {
    TaskDto create(CreateTaskRequest createTaskRequest);
}
