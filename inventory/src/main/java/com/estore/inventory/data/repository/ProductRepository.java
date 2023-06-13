package com.estore.inventory.data.repository;


import com.estore.inventory.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("select p from Product as p where p.category.categoryId = :categoryId")
    List<Product> findByCategoryId(@Param("categoryId")long categoryId);
}
