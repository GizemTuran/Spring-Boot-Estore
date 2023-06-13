package com.estore.commerce.data;

import java.util.List;

public class CartDto {

    private long cartId;
    private String customerName;
    private List<CartProductDto> cartProductDtoList;

    public CartDto() {
    }

    public CartDto(long cartId, String customerName, List<CartProductDto> cartProductDtoList) {
        this.cartId = cartId;
        this.customerName = customerName;
        this.cartProductDtoList = cartProductDtoList;
    }

    public CartDto(String customerName, List<CartProductDto> cartProductDtoList) {
        this.customerName = customerName;
        this.cartProductDtoList = cartProductDtoList;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
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
}
