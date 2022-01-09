package com.challenge.challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author hasanAltun
 */

@Data
@AllArgsConstructor
public class CreateOrderDTO {
    private String customerName;
    private String customerEmail;
    private String orderNumber;
    private int age;
}
