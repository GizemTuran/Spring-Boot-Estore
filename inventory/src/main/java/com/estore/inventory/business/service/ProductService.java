package com.estore.inventory.business.service;

import com.estore.inventory.business.dto.CategoryDto;
import com.estore.inventory.business.dto.ProductDto;
import com.estore.inventory.data.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    public List<ProductDto> findAll();
    public ProductDto findById(long id);
    public String addProduct(ProductDto productDto);
    List<ProductDto> findByCategoryId(long categoryId);
}
