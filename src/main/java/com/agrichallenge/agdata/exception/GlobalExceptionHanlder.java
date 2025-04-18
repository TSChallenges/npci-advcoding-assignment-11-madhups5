package com.agrichallenge.agdata.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class GlobalExceptionHanlder {
    @ExceptionHandler(ResponseStatusException.class)
public ResponseEntity<String> handle(ResponseStatusException ex) {
    return ResponseEntity.status(ex.getStatusCode()).body(ex.getReason());
}
}
