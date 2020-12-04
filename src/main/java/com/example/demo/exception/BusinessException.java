package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)

public class BusinessException extends Exception {
    private static final long serialVersionUID = 1L;

    public static final String INVALID_DATE = "it is not possible to register a past or null date";
    public static final String ROOM_NOT_FOUND = "Room Not Found";
    public static final String NULL_FIELD = "Null Field";
    public static final String TIME_ERROR = "the start time must precede the end time";

    public BusinessException(String message){
        super(message);
    }
}
