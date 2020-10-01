package com.example.demo.orders.controller;

import com.example.demo.orders.entity.OrderDetail;
import com.example.demo.orders.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/details")
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class OrderDetailController {

    private final OrderDetailService service;

    @GetMapping(value = "/{order}/order", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<OrderDetail>> getDetails(@PathVariable Integer order) {
        return ResponseEntity.ok(service.retrieveDetailsByOrder(order));
    }
}
