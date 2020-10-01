package com.example.demo.orders.exception;

import com.example.demo.orders.model.ApiError;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(value = {OrdersException.class})
    protected ResponseEntity<Object> handleConflict(OrdersException ex, WebRequest request) {

        return handleExceptionInternal(ex, ApiError.builder().code(ex.getCode().toString()).description(ex.getLocalizedMessage()).build(),
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);

    }


}
