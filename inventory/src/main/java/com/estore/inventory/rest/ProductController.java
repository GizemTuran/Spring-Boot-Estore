package com.estore.inventory.rest;

import com.estore.inventory.business.dto.CategoryDto;
import com.estore.inventory.business.dto.ProductDto;
import com.estore.inventory.business.service.ProductService;
import com.estore.inventory.data.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/api/inventory/product/{id}")
    public ProductDto findById(@PathVariable("id") long id){

    return productService.findById(id);
}
    @GetMapping("/api/inventory/products/{id}")
    public List<ProductDto> findByCategoryId(@PathVariable("id")long categoryId){
        List<ProductDto> productDto = productService.findByCategoryId(categoryId);
        return productDto;
    }
    @PostMapping("api/inventory/products/add")
    public String addProduct(@RequestBody ProductDto productDto){
    return productService.addProduct(productDto);
    }
}
