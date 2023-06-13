package com.estore.commerce.rest;

import com.estore.commerce.business.service.InventoryService;
import com.estore.commerce.data.CategoryDto;
import com.estore.commerce.data.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/api/commerce/inventory/categories")
    public List<CategoryDto> getCategories(){
        return inventoryService.getCategories();
    }
    @GetMapping("/api/commerce/inventory/product/{id}")
    public ProductDto getProduct(@PathVariable("id")long productId){
        return inventoryService.getProduct(productId);
    }
    @GetMapping("/api/commerce/inventory/products/{id}")
    public List<ProductDto> getProductsByCategoryId(@PathVariable("id")long categoryId){
        return inventoryService.getProductsByCategoryId(categoryId);
    }
}
