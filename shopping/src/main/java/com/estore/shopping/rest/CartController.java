package com.estore.shopping.rest;

import com.estore.shopping.business.service.CartProductService;
import com.estore.shopping.business.service.CartService;
import com.estore.shopping.data.entity.Cart;
import com.estore.shopping.dto.CartDto;
import com.estore.shopping.dto.CartProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping ("/api/shopping/cart/{cartId}")
    public CartDto findById(@PathVariable("cartId")long cartId){
        return cartService.findById(cartId);
    }
    @GetMapping("/api/shopping/cart/create")
    public String createCart(){
        return cartService.create();
    }
}
