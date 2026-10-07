package com.ecommerce;

public class Order {

    private int orderId;
    private Buyer buyer;
    private Product product;
    private int quantity;
    private double totalAmount;
    private String status;

    public Order(int orderId, Buyer buyer, Product product, int quantity, String status) {
        this.orderId = orderId;
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
        this.totalAmount = product.getPrice() * quantity;
        this.status = status;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Buyer: " + buyer.getName());
        System.out.println("Product: " + product.getProductName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: ₹" + totalAmount);
        System.out.println("Status: " + status);
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }
}