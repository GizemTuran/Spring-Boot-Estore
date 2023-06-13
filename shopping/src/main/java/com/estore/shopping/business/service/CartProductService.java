package com.estore.shopping.business.service;

import com.estore.shopping.data.entity.CartProduct;
import com.estore.shopping.dto.CartProductDto;

public interface CartProductService {
    public String addProduct(CartProductDto cartProductDto);
}
