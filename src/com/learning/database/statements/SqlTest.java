package com.learning.database.statements;

import java.sql.*;

public class SqlTest {
    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/miniproject", "postgres", "44332211");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Statement stmt = null;
        ResultSet rs;
        try {
            stmt = c.createStatement();
            rs = stmt.executeQuery("select * from bookings");
            while(rs.next()){
                System.out.println(rs.getInt("userid")+"::"+rs.getString("fromlocation")+"::"+rs.getDate("traveldate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
