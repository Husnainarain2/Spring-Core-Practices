package com.husnain.repositry;

import com.husnain.model.Student;

import java.sql.*;
import java.util.List;

public class StudentRepositry {

    String url= "jdbc:mysql://localhost" +
            ":3306/student_db";
    String user = "root";
    String password = "Husnain786";

    public void createStudent(Student student){

            String sql= """
                    INSERT INTO students(name, age)
                    VALUES(?, ?)
""";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement statement =
                    conn.prepareStatement(sql)) {

            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());

          int affectedRow=
                  statement.executeUpdate();
          if (affectedRow==1){
              System.out.println("Create Student successful");
          }else {
              System.out.println("Create Student failed");
          }
    } catch (
    SQLException e) {
        System.out.println("Connection Failed! Check output console");
        e.printStackTrace();

    }
    }

    public void updateStudent(Student student,
                              int id){
        String sql= """

                UPDATE students
                    SET name = ?,
                        age = ?
                    WHERE id = ?
              """;
        try(Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement  statement = conn.prepareStatement(sql);
        ){
            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.setInt(3, id);
            int affectedRow= statement.executeUpdate(

            );
            if (affectedRow==1){

            System.out.println("Update " +
                    " to database successfully");
            }
            else {
                System.out.println("Update " +
                        " to database failed");
            }

        } catch (
                SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }
    }

    public void deleteStudent(int id) {
        String sql = """
                DELETE FROM students
                WHERE id = ?
""";
        try(Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = conn.prepareStatement(sql)
        ) {
            statement.setInt(1, id);
            int affectedRow= statement.executeUpdate();
            if (affectedRow==1){

            System.out.println("Delete " + id + " from database successfully");
            }
            else {
                System.out.println("Delete " + id + " from database failed");
            }
        } catch (
                SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }
    }
        public void readStudentByID(int id){
        String sql = """
                SELECT name, age, id
                FROM students
                WHERE id = ?
                """;
            try(Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement statement =
                        conn.prepareStatement(sql);
            ) {
               statement.setInt(1, id);
                try (ResultSet resultSet=
                             statement.executeQuery()){
                    if (resultSet.next()){
                        Student student= mapRow(resultSet);
                        System.out.println(student);
                    }else {
                        System.out.println("Student with id " + id + " not found");
                }
                }
            } catch (
                    SQLException e) {
                System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }
    }
        public void readAllStudent(){
        String sql= """
               SELECT name, age, id
                FROM students
               """;
            try(Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement statement=conn.prepareStatement(sql);){
                try (ResultSet resultSet=statement.executeQuery()){
                    List<Student> students= new java.util.ArrayList<>();
                    while (resultSet.next()){
                        Student student= mapRow(resultSet);
                        students.add(student);
                        System.out.println(student);
                    }

                }
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
