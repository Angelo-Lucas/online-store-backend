package com.onlinestore.service;

import com.onlinestore.domain.Product;
import com.onlinestore.records.ProductRecord;

import java.util.List;

public interface ProductService {

    Product addProduct(ProductRecord product);

    List<ProductRecord> getProduct();
}
