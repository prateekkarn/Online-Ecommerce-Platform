package com.ecommerce;

public class Seller extends User {
    private String shopName;
    private String gstNo;
    private String businessAddress;

    public Seller(int userId, String name, String email, String mobileNo,
                  String address, String password, String shopName,
                  String gstNo, String businessAddress) {

        super(userId, name, email, mobileNo, address, password);

        this.shopName = shopName;
        this.gstNo = gstNo;
        this.businessAddress = businessAddress;
    }

    public void addProduct(Product product) {
        System.out.println(name + " added product: "
                + product.getProductName()
                + " | Category: "
                + product.getCategory());
    }
}