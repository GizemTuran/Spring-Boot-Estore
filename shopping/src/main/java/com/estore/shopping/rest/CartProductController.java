package com.estore.shopping.rest;

import com.estore.shopping.business.service.CartProductService;
import com.estore.shopping.data.entity.CartProduct;
import com.estore.shopping.dto.CartProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartProductController {

    @Autowired
    private CartProductService cartProductService;

    @PostMapping("/api/shopping/cart/add")
    public String addProductToCart(@RequestBody CartProductDto cartProductDto){
        return cartProductService.addProduct(cartProductDto);
    }
}
