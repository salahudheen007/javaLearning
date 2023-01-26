package com.learning.database.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("org.postgresql.Driver");
        Connection c= DriverManager.getConnection("jdbc:postgresql://localhost:5432/miniproject","postgres","44332211");

    }
}
