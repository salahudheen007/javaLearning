package com.learning.database.DBconnection;

import org.postgresql.Driver;

import java.sql.*;
import java.util.Properties;

public class DbTest2 {
    public static void main(String[] args) throws SQLException {
        Driver driver=new Driver();
        String url="jdbc:postgresql://localhost:5432/miniproject";
        Properties prop=new Properties();
        prop.put("user","postgres");
        prop.put("password","44332211");
        Connection c=driver.connect(url,prop);
        PreparedStatement statement=c.prepareStatement("select * from bookings where userid=?");
        statement.setInt(1,10);
        ResultSet rs=statement.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("userid")+"::"+rs.getString("fromlocation")+"::"+rs.getDate("traveldate"));
        }
    }
}
