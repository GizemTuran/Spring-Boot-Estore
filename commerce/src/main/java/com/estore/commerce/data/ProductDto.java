package com.estore.commerce.data;

import java.util.Locale;

public class ProductDto {

    private CategoryDto category;
    private long categoryId;
    private String productName;
    private double productPrice;
    private int productAmount;


    public ProductDto() {
    }

    public ProductDto(CategoryDto category, long categoryId, String productName, double productPrice, int productAmount) {
        this.category = category;
        this.categoryId = categoryId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAmount = productAmount;
    }
    public CategoryDto getCategory(){
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }
}
