package com.example.demo.model;

public class user {

    private String product;
    private int quantity;

    // Constructor
    public user(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters and setters
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}