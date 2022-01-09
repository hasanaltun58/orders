package com.challenge.challenge.service;

import com.challenge.challenge.dto.CreateOrderDTO;
import com.challenge.challenge.model.Customer;
import com.challenge.challenge.repository.OrderRepository;
import org.elasticsearch.cluster.ClusterState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Order;

/**
 * @author hasanAltun
 */

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public com.challenge.challenge.model.Order createOrder(CreateOrderDTO createOrderDTO, Customer customer){
        com.challenge.challenge.model.Order order = new com.challenge.challenge.model.Order();

        order.setCustomer(customer);
        order.setOrderNumber(createOrderDTO.getOrderNumber());

        return orderRepository.save(order);
    }
}
