package com.ddd_workshop.domain;

public class Product {

    String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
