package dev.palgogo.todo.app.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
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
