package com.example.demo.orders.controller;

import com.example.demo.orders.entity.Order;
import com.example.demo.orders.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderController {

    private final OrderService service;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Order>> getAll() {
        return ResponseEntity.ok(service.retrieveAll());
    }

    @GetMapping(value = "/{product}/product", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Order>> getByProduct(@PathVariable Integer product) {
        return ResponseEntity.ok(service.retrieveByProduct(product));
    }

    @GetMapping(value = "/{client}/client",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Order>> getByClient(@PathVariable Integer client) {
        return ResponseEntity.ok(service.retrieveByClient(client));
    }
}
