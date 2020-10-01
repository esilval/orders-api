package com.example.demo.orders.exception;

import lombok.Getter;

@Getter
public class OrdersException extends RuntimeException {

    private final Integer code;

    public OrdersException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
