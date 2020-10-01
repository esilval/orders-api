package com.example.demo.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "PRODUCT_ID")
    private Integer productId;

    @Column(name = "CLIENT_ID")
    private Integer clientId;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "TAXES")
    private BigDecimal taxes;

    @Column(name = "TOTAL_AMOUNT")
    private BigDecimal totalAmount;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ORDER_DATE")
    private LocalDateTime orderDate;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<OrderDetail> details;

}
