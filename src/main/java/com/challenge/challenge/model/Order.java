package com.challenge.challenge.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author hasanAltun
 */
@Data
@Entity
@Table(name = "orders")
public class Order extends BaseEntity{

    @Column(name = "order_number")
    private String orderNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;
}
