package dev.palgogo.todo.app.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class DepartmentDto {
    private UUID id;
    private String name;
}