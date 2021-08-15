package com.durvisha.exception.handler;

import com.durvisha.exception.AimException;
import com.durvisha.exception.StoreFailureException;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice

public class StoreFailureExceptionHandler {

    @ExceptionHandler(value = {StoreFailureException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ResponseEntity<AimException> storeNotFoundException(StoreFailureException ex, WebRequest request) {
        AimException aimException = AimException.builder().statusCode(HttpStatus.NOT_FOUND.value()).timestamp(new Date()).message(ex.getMessage()).description(request.getDescription(false)).build();
        return new ResponseEntity<AimException>(AimException.builder().build(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<AimException> globalExceptionHandler(Exception ex, WebRequest request) {
        AimException aimException = AimException.builder().statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value()).timestamp(new Date()).message(ex.getMessage()).description(request.getDescription(false)).build();
        return new ResponseEntity<AimException>(aimException, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

