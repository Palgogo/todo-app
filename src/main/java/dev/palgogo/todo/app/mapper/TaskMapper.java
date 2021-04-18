package dev.palgogo.todo.app.mapper;

import dev.palgogo.todo.app.dto.CreateTaskRequest;
import dev.palgogo.todo.app.dto.TaskDto;
import dev.palgogo.todo.app.entity.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TaskMapper {

    TaskEntity toTaskEntity(TaskDto taskDto);

    TaskEntity toTaskEntity(CreateTaskRequest createTaskRequest);

    TaskDto toTaskDto(TaskEntity taskEntity);

    TaskDto toTaskDto(CreateTaskRequest request);
}
