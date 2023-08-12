package com.example.apiintegrationusingretrofitinspringboot.service;

import com.example.apiintegrationusingretrofitinspringboot.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product insert(Product product);

    Product update(Product product , Integer id );

    Product delete(Integer id );
}
