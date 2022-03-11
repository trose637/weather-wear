package com.algonquin.weatherw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnectionToDatabase() throws SQLException {
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Registered");

            c = DriverManager.getConnection("jdbc:mysql://localhost:12345/Capstone?characterEncoding=latin1&useConfigs=maxPerformance","root","hamza");
            

        }catch(ClassNotFoundException e) {
            System.out.println("Error: No MySQL JDBC Driver");
        }
        catch (SQLException e) {
            System.out.println("Error: Connection failed. Check output console");
            e.printStackTrace();
        }

        if(c!=null) {
            System.out.println("Connection Successful!");

        }
        return c;
       
    }

}