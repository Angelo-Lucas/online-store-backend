package com.onlinestore.resource;

import com.onlinestore.domain.Product;
import com.onlinestore.records.ProductRecord;
import com.onlinestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody ProductRecord product){
        return ResponseEntity.ok(productService.addProduct(product));
    }

    @GetMapping()
    public ResponseEntity<List<ProductRecord>> getProducts(){
        return ResponseEntity.ok(productService.getProduct());
    }
}
