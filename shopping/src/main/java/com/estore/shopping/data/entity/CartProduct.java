package com.estore.shopping.data.entity;

import jakarta.persistence.*;

@Entity
public class CartProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long cartProductId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cart_id")
    private Cart cart;
    private long productId;

    public CartProduct() {
    }

    public CartProduct(long cartProductId, Cart cart, long productId) {
        this.cartProductId = cartProductId;
        this.cart = cart;
        this.productId = productId;
    }

    public CartProduct(Cart cart, long productId) {
        this.cart = cart;
        this.productId = productId;
    }

    public long getCartProductId() {
        return cartProductId;
    }

    public void setCartProductId(long cartProductId) {
        this.cartProductId = cartProductId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }
}
