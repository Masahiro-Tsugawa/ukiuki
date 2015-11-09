package com.internousdev.ukiukiutopia.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

//	 private static String driverName ="org.gjt.mm.mysql.Driver";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost/sports_gym";
    private static String user = "root";
    private static String pass = "mysql";
    public static Connection getConnection() {
//    	System.out.println("★★DBconnector内");

        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("★DBconnector内");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ClassNotFoundException");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQLException");
        }
        return con;
    }
}