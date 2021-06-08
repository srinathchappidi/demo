package com.example.demo.exception;

import com.example.demo.response.DemoErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class DemoExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<DemoErrorResponse> noSuchElementException(NoSuchElementException exception){
        DemoErrorResponse demoErrorResponse = new DemoErrorResponse();
        demoErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        demoErrorResponse.setMessage(exception.getMessage());

        return new ResponseEntity<>(demoErrorResponse, HttpStatus.NOT_FOUND);
    }
}
