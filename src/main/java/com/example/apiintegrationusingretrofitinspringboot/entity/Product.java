package com.example.apiintegrationusingretrofitinspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    private int id ;



    private String name;

    private Double price;

    private int quantity;
}
