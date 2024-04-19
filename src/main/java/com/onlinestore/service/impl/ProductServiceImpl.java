package com.onlinestore.service.impl;

import com.onlinestore.domain.Product;
import com.onlinestore.records.ProductRecord;
import com.onlinestore.repository.ProductRepository;
import com.onlinestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(ProductRecord product) {
        Product productEntity = Product
                .builder()
                .name(product.name())
                .description(product.description())
                .price(product.price())
                .quantity(product.quantity())
                .build();
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public List<ProductRecord> getProduct() {
        List<Product> allProducts = productRepository.findAll();

        return allProducts.stream()
                .map(Product::toProductRecord)
                .collect(Collectors.toList());
    }
}
