package com.estore.commerce.business.service;

import com.estore.commerce.data.CartDto;
import com.estore.commerce.data.CartProductDto;
import com.estore.commerce.data.ProductDto;

public interface ShoppingService {

    String createCart();
    CartDto findCart(long cartId);
    String addProductToCart(CartProductDto cartProductDto);
}
