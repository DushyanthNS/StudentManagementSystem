package com.student_management;



import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {
            String url = "jdbc:mysql://localhost:3306/student_db";
            String username = "root";
            String password = "123123";

            con = DriverManager.getConnection(
                url, username, password
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}

