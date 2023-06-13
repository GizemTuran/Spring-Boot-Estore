package com.estore.commerce.data;

public class CategoryDto {

    private String categoryName;
    private long categoryId;

    public CategoryDto() {
    }

    public CategoryDto(String name, long id) {
        this.categoryName = name;
        this.categoryId = id;
    }

    public CategoryDto(String name) {
        this.categoryName = name;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }
}
