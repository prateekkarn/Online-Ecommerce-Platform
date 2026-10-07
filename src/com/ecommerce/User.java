package com.ecommerce;

public class User {
    protected int userId;
    protected String name;
    protected String email;
    protected String mobileNo;
    protected String address;
    protected String password;
    public String getName() {
        return name;
    }
    public User(int userId, String name, String email, String mobileNo,
                String address, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.address = address;
        this.password = password;

    }

    public void displayInfo() {
        System.out.println("User: " + name);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobileNo);
        System.out.println("Address: " + address);
    }
}