package com.estore.inventory.business.dto;

import java.io.Serializable;

public class CategoryDto implements Serializable {
    private String name;
    private long id;

    public CategoryDto(String name) {
        this.name = name;
    }

    public CategoryDto(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public CategoryDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CategoryDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
