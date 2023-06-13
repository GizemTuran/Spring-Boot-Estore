package com.estore.shopping.dto;

import com.estore.shopping.data.entity.CartProduct;

import java.util.List;

public class CartDto {

    private long cardId;
    private String customerName;
    private List<CartProductDto> cartProductDtoList;

    public CartDto() {
    }

    public CartDto(String customerName, List<CartProductDto> cartProductDtoList) {
        this.customerName = customerName;
        this.cartProductDtoList = cartProductDtoList;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<CartProductDto> getCartProductDtoList() {
        return cartProductDtoList;
    }

    public void setCartProductDtoList(List<CartProductDto> cartProductDtoList) {
        this.cartProductDtoList = cartProductDtoList;
    }

    public CartDto(long cardId, String customerName, List<CartProductDto> cartProductDtoList) {
        this.cardId = cardId;
        this.customerName = customerName;
        this.cartProductDtoList = cartProductDtoList;
    }

}
