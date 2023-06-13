package com.estore.shopping.business.service;

import com.estore.shopping.data.entity.Cart;
import com.estore.shopping.data.entity.CartProduct;
import com.estore.shopping.data.repository.CartProductRepository;
import com.estore.shopping.data.repository.CartRepository;
import com.estore.shopping.dto.CartDto;
import com.estore.shopping.dto.CartProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CartProductRepository cartProductRepository;

    @Override
    public String create(){
        Cart cart = new Cart();
        cartRepository.save(cart).getCartId();

        return "Cart created successfully.";
    }

    @Override
    public CartDto findById(long cardId) {
        Optional<Cart> optionalCart = cartRepository.findById(cardId);
        if (optionalCart.isPresent()){
            CartDto cartDto = new CartDto();
            cartDto.setCardId(optionalCart.get().getCartId());
            cartDto.setCustomerName(optionalCart.get().getCustomerName());

            List<CartProduct> cartProductList=cartRepository.findAllByCartId(cardId);
            List<CartProductDto> cartProductDtoList = new ArrayList<>();
            for(CartProduct cartProduct: cartProductList){
                CartProductDto cartProductDto = new CartProductDto();
                cartProductDto.setCartId(cartProduct.getCart().getCartId());
                cartProductDto.setCartProductId(cartProduct.getCartProductId());
                cartProductDto.setProductId(cartProduct.getProductId());
                cartProductDtoList.add(cartProductDto);
            }
            cartDto.setCartProductDtoList(cartProductDtoList);
            return cartDto;
            }
        return null;
    }
}
