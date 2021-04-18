package dev.palgogo.todo.app.service;

import dev.palgogo.todo.app.dto.UserDto;

import java.util.UUID;

public interface UserService {
    UserDto getUser(UUID authorId);
}
