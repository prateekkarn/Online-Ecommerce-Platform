package com.ecommerce;

public class Main {

    public static void main(String[] args) {

        Buyer b1 = new Buyer(
                1,
                "Prateek",
                "prateek@example.com",
                "7290920525",
                "Faridabad",
                "12345",
                "Faridabad",
                "UPI"
        );

        Seller s1 = new Seller(
                2,
                "Amit",
                "amit@example.com",
                "9123456780",
                "Faridabad",
                "12345",
                "TechStore",
                "GSTIN12345",
                "Delhi"
        );

        Product p1 = new Product(
                101,
                "Laptop",
                55000,
                "Electronics",
                10,
                4.5
        );

        b1.displayInfo();
        s1.displayInfo();

        p1.displayProduct();

        b1.placeOrder(p1, 2);

        s1.addProduct(p1);

        Order o1 = new Order(
                1001,
                b1,
                p1,
                2,
                "Pending"
        );

        o1.displayOrder();

        DatabaseDAO dao = new DatabaseDAO();
        dao.showProducts();
    }
}