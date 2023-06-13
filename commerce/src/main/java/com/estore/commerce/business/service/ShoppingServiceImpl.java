package com.estore.commerce.business.service;

import com.estore.commerce.data.CartDto;
import com.estore.commerce.data.CartProductDto;
import com.estore.commerce.data.ProductDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService{

    public String createCart(){
        String url = "http://localhost:8082/api/shopping/cart/create";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url,String.class);
        return response;
    }

    public CartDto findCart(long cartId) {
        String url = "http://localhost:8082/api/shopping/cart/" + cartId;
        RestTemplate restTemplate = new RestTemplate();
        CartDto cartDto = restTemplate.getForObject(url, CartDto.class);

        List<CartProductDto> cartProductDtoList = new ArrayList<>();

        cartProductDtoList = cartDto.getCartProductDtoList();
        int i = 0;
        for (CartProductDto cartProductDto : cartDto.getCartProductDtoList()) {
            String url2 = "http://localhost:8081/api/inventory/product/" + cartProductDto.getProductId();
            ProductDto productDto = restTemplate.getForObject(url2, ProductDto.class);
            cartProductDtoList.get(i).setProductName(productDto.getProductName());
            i++;
        }
        cartDto.setCartProductDtoList(cartProductDtoList);
        return cartDto;
    }

    @Override
    public String addProductToCart(CartProductDto cartProductDto) {
        String url = "http://localhost:8082/api/shopping/cart/add";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.postForObject(url,cartProductDto, String.class);

        return response;
    }
}
