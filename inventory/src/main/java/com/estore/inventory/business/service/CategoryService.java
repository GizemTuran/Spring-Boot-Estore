package com.estore.inventory.business.service;

import com.estore.inventory.business.dto.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    public List<CategoryDto> findAll();
    public CategoryDto findById(long id);
}
