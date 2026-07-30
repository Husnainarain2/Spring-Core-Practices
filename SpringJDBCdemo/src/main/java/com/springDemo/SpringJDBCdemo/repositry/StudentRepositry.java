package com.springDemo.SpringJDBCdemo.repositry;

import com.springDemo.SpringJDBCdemo.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositry {
    private final JdbcTemplate jdbcTemplate;
    public StudentRepositry(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {
        String sql="""
                         INSERT INTO students(name, age)
                         VALUES(?, ?)
                         """;
       int rowEffected=jdbcTemplate.update(sql,
               student.getName(), student.getAge());
       if(rowEffected==1){
           System.out.println("Student Created");
       }else{
           System.out.println("Student Not Created");
       }
    }
}
