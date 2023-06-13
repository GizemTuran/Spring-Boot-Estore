package com.estore.inventory.data.entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;
    private String categoryName;

    public Category(){

    }

    public Category(String categoryName){this.categoryName=categoryName;}
    public Category(String categoryName, Long categoryId){
        this.categoryName=categoryName;
        this.categoryId=categoryId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
