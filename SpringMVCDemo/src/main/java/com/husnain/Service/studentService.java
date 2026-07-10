package com.husnain.Service;

import com.husnain.Entity.Student;
import com.husnain.Repositry.studentRepositry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class studentService {
   private studentRepositry studentRepositry;

    public studentService(studentRepositry studentRepositry) {
        this.studentRepositry = studentRepositry;
    }
    public Student saveStudent(Student studentReq) {
        return studentRepositry.save(studentReq);
    }
    public Student findStudentById(Long id) {
        return studentRepositry.findById(id);
    }
    public List<Student> findAllStudents() {
        return studentRepositry.findAll();
    }
    public boolean deleteStudentById(Long id) {
        return studentRepositry.deleteById(id);
    }
    public Student updateStudent(Long id, Student studentReq) {
        Student existingStudent = studentRepositry.findById(id);
        if (existingStudent != null) {
            existingStudent.setName(studentReq.getName());
            existingStudent.setEmail(studentReq.getEmail());
            existingStudent.setId(studentReq.getId());
            return studentRepositry.save(existingStudent);
        }
        return null;
    }

}
