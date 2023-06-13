package com.estore.commerce.business.service;

import com.estore.commerce.data.CategoryDto;
import com.estore.commerce.data.ProductDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Override
    public List<CategoryDto> getCategories(){
        String url="http://localhost:8081/api/inventory/categories";
        RestTemplate restTemplate = new RestTemplate();
        List<CategoryDto> categoryDtoList = restTemplate.getForObject(url, List.class);
        return categoryDtoList;
    }
    @Override
    public ProductDto getProduct(long productId){
        String url = "http://localhost:8081/api/inventory/product/"+productId;
        RestTemplate restTemplate = new RestTemplate();
        ProductDto productDto = restTemplate.getForObject(url,ProductDto.class); //ProductDto objesi için istek atılır, hangi class tipinde dönecek ->productDto
        return productDto;
    }

    @Override
    public List<ProductDto> getProductsByCategoryId(long categoryId) {

        String url = "http://localhost:8081/api/inventory/products/"+categoryId;
        RestTemplate restTemplate = new RestTemplate();
        List<ProductDto> productDtoList=restTemplate.getForObject(url,List.class);
        return productDtoList;
    }

}
