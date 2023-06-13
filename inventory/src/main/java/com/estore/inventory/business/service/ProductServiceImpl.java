package com.estore.inventory.business.service;

import com.estore.inventory.business.dto.CategoryDto;
import com.estore.inventory.business.dto.ProductDto;
import com.estore.inventory.data.entity.Category;
import com.estore.inventory.data.entity.Product;
import com.estore.inventory.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductDto> findAll() {

        return null;
    }

    @Override
    public ProductDto findById(long id) {
        Optional<Product> optional = productRepository.findById(id);
        if(optional.isPresent()){
            Product product = optional.get();
            ProductDto productDto = new ProductDto();
            productDto.setProductId(product.getProductId());
            productDto.setProductName(product.getProductName());
            productDto.setProductPrice(product.getProductPrice());
            productDto.setProductAmount(product.getProductAmount());
            productDto.setCategory(product.getCategory());
            productDto.setCategoryId(product.getCategory().getCategoryId());
            return productDto;
        }
        return null;
    }

    @Override
    public List<ProductDto> findByCategoryId(long categoryId) {
        Optional<List<Product>> optional = Optional.ofNullable(productRepository.findByCategoryId(categoryId));
        if (optional.isPresent()){
            List<ProductDto> productDtoList = new ArrayList<>();
            for(Product product: optional.get()){
                ProductDto productDto = new ProductDto();
                productDto.setProductId(product.getProductId());
                productDto.setProductName(product.getProductName());
                productDto.setProductAmount(product.getProductAmount());
                productDto.setProductPrice(product.getProductPrice());
                productDto.setCategory(product.getCategory());
                productDto.setCategoryId(product.getCategory().getCategoryId());
                productDtoList.add(productDto);
            }
            return productDtoList;
        }
        return null;
    }

    @Override
    public String addProduct(ProductDto productDto) {


        Product product = new Product();
        Category category = new Category();
        CategoryDto categoryDto;
        categoryDto = categoryService.findById(productDto.getCategoryId());
        category.setCategoryId(categoryDto.getId());
        category.setCategoryName(categoryDto.getName());

        product.setProductName(productDto.getProductName());
        product.setProductAmount(productDto.getProductAmount());
        product.setProductPrice(productDto.getProductPrice());
        product.setCategory(category);

        productRepository.save(product);
        return "Product is added..";

    }
}
