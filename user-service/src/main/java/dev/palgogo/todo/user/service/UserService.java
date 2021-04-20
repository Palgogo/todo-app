package dev.palgogo.todo.user.service;

import dev.palgogo.todo.user.dto.UserDto;

import java.util.UUID;

public interface UserService {
    UserDto getUser(UUID authorId);
}
