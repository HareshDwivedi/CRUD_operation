package com.haresh.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
                //Driver class load
                Class.forName("com.mysql.cj.jdbc.Driver");
                //create a connection
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
