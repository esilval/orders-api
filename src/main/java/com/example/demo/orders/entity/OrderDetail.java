package com.example.demo.orders.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDER_DETAILS")
public class OrderDetail {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DETAIL_DATE")
    private LocalDateTime detailDate;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;
}
