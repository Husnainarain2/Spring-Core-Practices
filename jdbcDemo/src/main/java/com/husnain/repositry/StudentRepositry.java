package com.husnain.repositry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRepositry {

    String url= "jdbc:mysql://localhost" +
            ":3306/student_db";
    String user = "root";
    String password = "Husnain786";

    public void createStudent(){

        try{

        Connection conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();

            String sql="INSERT INTO students (name, age)\n" +
                    "VALUES ('Husnain', 21);";
            statement.executeUpdate(sql);
        System.out.println("Connected to database successfully");

    } catch (
    SQLException e) {
        System.out.println("Connection Failed! Check output console");
        e.printStackTrace();

    }
    }

    public void updateStudent(){
        try{

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();

            String sql="UPDATE students SET " +
                    "name='Husnain Khan', age=22 WHERE id=1;";
            statement.executeUpdate(sql);
            System.out.println("Update " +
                    " to database successfully");

        } catch (
                SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }
    }


}
