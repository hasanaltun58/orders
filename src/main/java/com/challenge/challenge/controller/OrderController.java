package com.challenge.challenge.controller;

import com.challenge.challenge.dto.CreateOrderDTO;
import com.challenge.challenge.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hasanAltun
 */

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/create")
    public ResponseEntity<CreateOrderDTO> createOrder(@RequestBody CreateOrderDTO createOrderDTO){
        return ResponseEntity.ok(customerService.create(createOrderDTO));
    }
}
