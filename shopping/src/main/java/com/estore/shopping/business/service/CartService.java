package com.estore.shopping.business.service;

import com.estore.shopping.dto.CartDto;

public interface CartService {
    public CartDto findById(long cardId);
    public String create();

}
