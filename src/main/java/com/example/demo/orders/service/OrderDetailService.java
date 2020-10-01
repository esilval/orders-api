package com.example.demo.orders.service;

import com.example.demo.orders.entity.Order;
import com.example.demo.orders.entity.OrderDetail;
import com.example.demo.orders.exception.OrdersException;
import com.example.demo.orders.repository.OrderDetailRepository;
import com.example.demo.orders.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class OrderDetailService {

    private final OrderDetailRepository repository;

    private final OrderRepository orderRepository;

    public final List<OrderDetail> retrieveDetailsByOrder(final Integer orderId) {
        log.info("Retrieving details for order {}", orderId);
        final Order order = orderRepository.findById(orderId).orElseThrow(() ->
                new OrdersException(HttpStatus.NOT_FOUND.value(), "Order not found."));

        return repository.findByOrder(order);
    }

}
