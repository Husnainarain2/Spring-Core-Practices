package com.example.controller;

import com.example.entity.Product;
import com.example.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class productController {
    private final ProductService productService;
    public productController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }
}
