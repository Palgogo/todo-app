package dev.palgogo.todo.app.service.impl;

import dev.palgogo.todo.app.dto.UserDto;
import dev.palgogo.todo.app.service.UserService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDto getUser(UUID authorId) {
        return null;
    }
}
