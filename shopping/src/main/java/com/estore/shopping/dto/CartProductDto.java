package com.estore.shopping.dto;

public class CartProductDto {
    private long cartProductId;
    private long productId;
    private long cartId;

    public CartProductDto() {
    }

    public CartProductDto(long productId, long cartId) {
        this.productId = productId;
        this.cartId = cartId;
    }

    public CartProductDto(long cartProductId, long productId, long cartId) {
        this.cartProductId = cartProductId;
        this.productId = productId;
        this.cartId = cartId;
    }

    public long getCartProductId() {
        return cartProductId;
    }

    public void setCartProductId(long cartProductId) {
        this.cartProductId = cartProductId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }
}
