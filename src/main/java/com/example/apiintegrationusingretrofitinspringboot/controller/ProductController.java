package com.example.apiintegrationusingretrofitinspringboot.controller;

import com.example.apiintegrationusingretrofitinspringboot.entity.Product;
import com.example.apiintegrationusingretrofitinspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/retrofit")
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping("/findAll")
    List<Product> getAllProducts(){
       return service.getAllProducts();
    }

    @PostMapping("/insert")
    Product insertProduct(@RequestBody Product product){
        return service.insert(product);
    }

    @PutMapping("/update/{id}")
    Product updateProduct(@RequestBody Product product , @PathVariable Integer id ){
        return service.update(product, id);
    }

    @DeleteMapping("/delete/{id}")
    Product deleteProduct( @PathVariable Integer id ){
        return service.delete( id);
    }
}
