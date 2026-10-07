package com.ecommerce;

import java.sql.*;

public class DatabaseDAO {

    private static final String URL =
            "jdbc:mysql://localhost:3306/ecommerce";

    private static final String USER = "root";

    private static final String PASSWORD = "7290920525";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void showProducts() {

        String sql = "SELECT * FROM products";

        try (
                Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("product_id") + " | " +
                                rs.getString("product_name") + " | ₹" +
                                rs.getDouble("price") + " | Category: " +
                                rs.getString("category") + " | Stock: " +
                                rs.getInt("stock_quantity") + " | Rating: " +
                                rs.getDouble("rating")
                );
            }

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}