package com.durvisha.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
public class StoreFailureException extends RuntimeException {


    public StoreFailureException(String msg) {
        super(msg);
    }
}