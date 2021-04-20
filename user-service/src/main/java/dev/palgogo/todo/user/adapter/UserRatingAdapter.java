package dev.palgogo.todo.user.adapter;

import dev.palgogo.todo.app.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class UserRatingAdapter {

    static final Integer DEFAULT_RATING = 0;
    @Value("${rating-service.access-token}")
    private String accessToken;

    public Integer getUserRating(UserDto user) {
        //build request

        try {
            //execute request call

            //if request is successful - return rating
            //if not - return default value
            //if all bad
            throw new IOException();
        } catch (IOException e) {
            log.error("Something wrong with request", e);
        }
        return DEFAULT_RATING;
    }
}
