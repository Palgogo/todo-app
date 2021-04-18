package dev.palgogo.todo.app.service;

import dev.palgogo.todo.app.dto.CreateTaskRequest;
import dev.palgogo.todo.app.dto.TaskDto;
import dev.palgogo.todo.app.dto.UpdateAssigneeRequest;
import dev.palgogo.todo.app.dto.UpdateStatusRequest;

import java.util.UUID;

public interface TaskService {
    TaskDto create(CreateTaskRequest createTaskRequest);

    void updateStatus(UUID id, UpdateStatusRequest updateStatusRequest);

    void updateAssignee(UUID id, UpdateAssigneeRequest updateAssigneeRequest);

}
