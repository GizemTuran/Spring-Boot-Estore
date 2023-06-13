package com.estore.commerce.business.service;

import com.estore.commerce.data.CategoryDto;
import com.estore.commerce.data.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InventoryService {
    List<CategoryDto> getCategories();
    ProductDto getProduct(long productId);
    List<ProductDto> getProductsByCategoryId(long categoryId);

}
