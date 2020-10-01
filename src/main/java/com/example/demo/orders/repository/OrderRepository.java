package com.example.demo.orders.repository;

import com.example.demo.orders.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByProductId(Integer productId);

    List<Order> findByClientId(Integer clientId);

}
