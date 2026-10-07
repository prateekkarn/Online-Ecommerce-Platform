package com.ecommerce;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private String category;
    private int stockQuantity;
    private double rating;

    public Product(int productId, String productName, double price,
                   String category, int stockQuantity, double rating) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.rating = rating;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Category: " + category);
        System.out.println("Stock: " + stockQuantity);
        System.out.println("Rating: " + rating);
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public double getRating() {
        return rating;
    }
}