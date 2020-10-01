package com.example.demo.orders.repository;

import com.example.demo.orders.entity.Order;
import com.example.demo.orders.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {

    List<OrderDetail> findByOrder(Order order);
}
