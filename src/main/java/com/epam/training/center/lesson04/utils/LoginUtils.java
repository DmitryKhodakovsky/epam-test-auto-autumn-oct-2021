package com.epam.training.center.lesson04.utils;

import com.epam.training.center.lesson04.entities.User;
import io.qameta.allure.Step;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LoginUtils {
    public static final User DEFAULT_USER = new User("Johnny", "P@ssw0rd");
    public static final User EMPTY_USER = new User("", "");

    @Step
    public void typeLogin(@NonNull final String userName) {

    }

    @Step
    public void typePassword(@NonNull final String password) {

    }

    @Step
    public void login(@NonNull final User user) {
        if (EMPTY_USER.equals(user)) {
            throw new IllegalArgumentException("Empty credentials");
        }
        typeLogin(user.getName());
        typePassword(user.getPassword());
    }
}
