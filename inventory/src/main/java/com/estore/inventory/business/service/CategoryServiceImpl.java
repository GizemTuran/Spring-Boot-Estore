package com.estore.inventory.business.service;

import com.estore.inventory.business.dto.CategoryDto;
import com.estore.inventory.data.entity.Category;
import com.estore.inventory.data.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }
    @Override
    public List<CategoryDto> findAll() {
        List<Category> categoryList = categoryRepository.findAll(); //dbden datalar çekilir.
        List<CategoryDto> categoryDtoList = new ArrayList<>();
        categoryDtoList = categoryList.stream().map(category -> new CategoryDto(category.getCategoryName())).collect(Collectors.toList()); //category categorydtoya çevrilir böylece id alınmaz
       /* for (Category c:categoryList){
            categoryDtoList.add(new CategoryDto(c.getCategoryName()));
        }*/
        return categoryDtoList;
    }

    @Override
    public CategoryDto findById(long id) {
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        if(categoryOptional.isPresent()) {
            CategoryDto categoryDto = new CategoryDto();
            categoryDto.setId(categoryOptional.get().getCategoryId().byteValue());
            categoryDto.setName(categoryOptional.get().getCategoryName());
            return categoryDto;
        }
        return null;
    }
}
