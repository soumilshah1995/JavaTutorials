package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try {

            // create a connection
            Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
            System.out.println("Data Base Created ... ");

            // Statments
            Statement statement = conn.createStatement();
            // statement.execute("CREATE TABLE people (name TEXT, age TEXT)");
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            // Variable to add to Database
            String name="Soumil";
            String age = "22";

            // Execute SQL Query
            statement.execute("insert into people values('"+name+"','"+age+"')");

            // Close the connection
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error " + e);


        }
    }
}