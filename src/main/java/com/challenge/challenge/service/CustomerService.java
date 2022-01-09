package com.challenge.challenge.service;

import com.challenge.challenge.dao.CustomerDao;
import com.challenge.challenge.dao.OrderDao;
import com.challenge.challenge.documents.CustomerDocument;
import com.challenge.challenge.documents.OrderDocument;
import com.challenge.challenge.dto.CreateOrderDTO;
import com.challenge.challenge.model.Customer;
import com.challenge.challenge.model.Order;
import com.challenge.challenge.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hasanAltun
 */

@Service
public class CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderDao orderDao;

    public CreateOrderDTO create(CreateOrderDTO createOrderDTO){
        Customer customer = new Customer();
        customer.setEmail(createOrderDTO.getCustomerEmail());
        customer.setName(createOrderDTO.getCustomerName());
        customer.setAge(createOrderDTO.getAge());

        customerRepository.save(customer);

        Order order = orderService.createOrder(createOrderDTO,customer);

        CustomerDocument customerDocument = new CustomerDocument(customer.getId().toString(),customer.getName(),customer.getEmail(),customer.getAge());
        customerDao.save(customerDocument);
        OrderDocument orderDocument = new OrderDocument(order.getId().toString(),order.getOrderNumber(),customerDocument);
        orderDao.save(orderDocument);
        return createOrderDTO;

    }
}
