package com.deepak.Spring_Security.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    private int productId;
    private String name;
    private int qty;
    private double price;

    
}
