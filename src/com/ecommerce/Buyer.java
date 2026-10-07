package com.ecommerce;

public class Buyer extends User {
    private String shippingAddress;
    private String paymentMethod;

    public Buyer(int userId, String name, String email, String mobileNo,
                 String address, String password,
                 String shippingAddress, String paymentMethod) {

        super(userId, name, email, mobileNo, address, password);

        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
    }

    public void placeOrder(Product product, int quantity) {
        double totalAmount = product.getPrice() * quantity;

        System.out.println("Buyer: " + name);
        System.out.println("Product: " + product.getProductName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: ₹" + totalAmount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Shipping Address: " + shippingAddress);
    }
}