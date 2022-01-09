package com.challenge.challenge.repository;

import com.challenge.challenge.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hasanAltun
 */
@Repository
public interface OrderRepository extends CrudRepository<Order,Long> {
}
