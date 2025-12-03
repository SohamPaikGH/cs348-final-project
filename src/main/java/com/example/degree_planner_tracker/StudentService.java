package com.example.degree_planner_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student findByStudentNo(Integer studentNo) {
        return studentRepository.findByStudentNo(studentNo);
    }
}
