package com.husnain.repositry;

import com.husnain.model.Student;

import java.sql.*;

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
            conn.close();
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
            conn.close();
        } catch (
                SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }
    }

    public void deleteStudent() {
        try {

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();

            String sql = "DELETE FROM students WHERE id=1;";
            statement.executeUpdate(sql);
            System.out.println("Delete " +
                    " from database successfully");
            conn.close();
        } catch (
                SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }
    }
        public void readStudent(){
            try{

                Connection conn = DriverManager.getConnection(url, user, password);
                Statement statement = conn.createStatement();

                String sql="SELECT name,age,id " +
                        "FROM students WHERE id=2;";
                ResultSet rs = statement.executeQuery(sql);
                rs.next();
                Student student = mapRow(rs);
                System.out.println(student);
                conn.close();
            } catch (
                    SQLException e) {
                System.out.println("Connection Failed! Check output console");
                e.printStackTrace();


        }

    }

    private Student mapRow(ResultSet rs){

        Student student = new Student();
        try {
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            student.setId(rs.getInt("id"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return student;
    }

}
