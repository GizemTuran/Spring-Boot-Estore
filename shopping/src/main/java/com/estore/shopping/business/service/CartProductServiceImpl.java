package com.estore.shopping.business.service;

import com.estore.shopping.data.entity.Cart;
import com.estore.shopping.data.entity.CartProduct;
import com.estore.shopping.data.repository.CartProductRepository;
import com.estore.shopping.data.repository.CartRepository;
import com.estore.shopping.dto.CartProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartProductServiceImpl implements CartProductService{
    @Autowired
    private CartProductRepository cartProductRepository;
    @Autowired
    private CartRepository cartRepository;
    @Override
    public String addProduct(CartProductDto cartProductDto) {
        Optional<Cart> optionalCart =cartRepository.findById((cartProductDto.getCartId()));
        if(optionalCart.isPresent()){
            CartProduct cartProduct = new CartProduct();
            cartProduct.setCartProductId(cartProductDto.getCartProductId());
            cartProduct.setProductId(cartProductDto.getProductId());
            cartProduct.setCart(optionalCart.get());
            cartProductRepository.save(cartProduct);
            return "Added successfully.";
        }
        return "Cart not found...";
    }
}
