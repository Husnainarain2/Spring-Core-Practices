package com.husnain.Repositry;

import com.husnain.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class studentRepositry {
    private Map<Long, Object> studentDB;

    public studentRepositry(Map<Long, Object> studentDB) {
        this.studentDB = studentDB;
    }
    public Student save(Student studentReq) {
        studentDB.put(studentReq.getId(), studentReq);
        return studentReq;
    }
    public Student findById(Long id) {
        return (Student) studentDB.get(id);
    }
    public ArrayList<Object> findAll() {
        return new ArrayList<>(studentDB.values());
    }
    public boolean deleteById(Long id) {
        if (studentDB.containsKey(id)) {
            studentDB.remove(id);
            return true;
        }
        else {
            return false;
        }
    }
    public void update(Student studentReq) {
        studentDB.put(studentReq.getId(), studentReq);
    }
}
