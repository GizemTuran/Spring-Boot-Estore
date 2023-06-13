package com.estore.inventory.rest;

import com.estore.inventory.business.dto.CategoryDto;
import com.estore.inventory.business.service.CategoryService;
import com.estore.inventory.business.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/api/inventory/categories")
    public List<CategoryDto> getCategories(){

        return categoryService.findAll();
    }
}
