package com.example.demo.orders.service;

import com.example.demo.orders.entity.Order;
import com.example.demo.orders.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderService {

    private final OrderRepository repository;

    public List<Order> retrieveAll() {
        return repository.findAll();
    }

    public List<Order> retrieveByProduct(Integer productId) {
        return repository.findByProductId(productId);
    }

    public List<Order> retrieveByClient(Integer clientId) {
        return repository.findByClientId(clientId);
    }
}
