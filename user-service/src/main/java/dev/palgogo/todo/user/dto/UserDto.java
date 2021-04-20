package dev.palgogo.todo.user.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.palgogo.todo.department.dto.DepartmentDto;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private DepartmentDto department;
    private Integer rating;
}
