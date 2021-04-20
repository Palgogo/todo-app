package dev.palgogo.todo.user.service.impl;

import dev.palgogo.todo.user.dto.UserDto;
import dev.palgogo.todo.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDto getUser(UUID authorId) {
        return null;
    }
}
