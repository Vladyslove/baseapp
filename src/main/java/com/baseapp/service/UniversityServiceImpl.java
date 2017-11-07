package com.baseapp.service;

import com.baseapp.dao.StudentDAO;
import com.baseapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("universityService")
public class UniversityServiceImpl implements UniversityService {
    StudentDAO studentDAO/* = new StudentDAOImpl()*/;

    public UniversityServiceImpl() {
    }

    public UniversityServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Autowired
    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public List<Student> getAvailableStudents() {
        return studentDAO.getStudents();
    }
}
