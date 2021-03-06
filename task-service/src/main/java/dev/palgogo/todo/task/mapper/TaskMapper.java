package dev.palgogo.todo.task.mapper;

import dev.palgogo.todo.task.dto.CreateTaskRequest;
import dev.palgogo.todo.task.dto.TaskDto;
import dev.palgogo.todo.task.entity.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TaskMapper {

    TaskEntity toTaskEntity(TaskDto taskDto);

    TaskEntity toTaskEntity(CreateTaskRequest createTaskRequest);

    TaskDto toTaskDto(TaskEntity taskEntity);

    TaskDto toTaskDto(CreateTaskRequest request);
}
