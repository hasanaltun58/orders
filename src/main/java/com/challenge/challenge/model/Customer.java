package com.challenge.challenge.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author hasanAltun
 */
@Data
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity{

    private String name;
    private String email;
    private int age;
}
