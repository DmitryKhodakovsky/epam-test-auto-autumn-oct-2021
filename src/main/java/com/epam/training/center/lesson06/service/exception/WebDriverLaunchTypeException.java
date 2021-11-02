package com.epam.training.center.lesson06.service.exception;

public class WebDriverLaunchTypeException extends IllegalArgumentException {

    public WebDriverLaunchTypeException() {
        super("Unsupported launch type. Supported launch types are local and remote");
    }
}