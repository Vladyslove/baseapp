package com.baseapp.dao;

import com.baseapp.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {

    public List<Student> getStudents() {
        List<Student> students = new ArrayList();
        Student student = new Student("Jon Doe");
        Student student2 = new Student("Jane Roe");

        students.add(student);
        students.add(student2);
        return students;
    }
}
