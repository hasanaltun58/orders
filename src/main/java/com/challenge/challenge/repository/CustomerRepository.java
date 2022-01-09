package com.challenge.challenge.repository;

import com.challenge.challenge.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hasanAltun
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
