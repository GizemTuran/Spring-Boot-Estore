package com.estore.commerce.rest;

import com.estore.commerce.business.service.ShoppingService;
import com.estore.commerce.data.CartDto;
import com.estore.commerce.data.CartProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShoppingController {
    @Autowired
    private ShoppingService shoppingService;

    @GetMapping("/api/commerce/shopping/cart/create")
    public String  createCart(){
        return shoppingService.createCart();
    }
    @GetMapping("/api/commerce/shopping/cart/find/{cartId}")
    public CartDto findCart(@PathVariable("cartId") long cartId){
        return shoppingService.findCart(cartId);
    }
    @PostMapping("/api/commerce/shopping/cart/add")
    public String addProductToCart(@RequestBody CartProductDto cartProductDto){
        return shoppingService.addProductToCart(cartProductDto);
    }
}
