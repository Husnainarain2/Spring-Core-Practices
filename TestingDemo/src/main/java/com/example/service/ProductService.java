package com.example.service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product save(Product product) {
       return productRepository.save(product);
    }
}
