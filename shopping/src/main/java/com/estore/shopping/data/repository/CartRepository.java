package com.estore.shopping.data.repository;

import com.estore.shopping.data.entity.Cart;
import com.estore.shopping.data.entity.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {

    @Query("select p from CartProduct as p where p.cart.cartId =:cartId")
    List<CartProduct> findAllByCartId(@Param("cartId")long cartId);
}
