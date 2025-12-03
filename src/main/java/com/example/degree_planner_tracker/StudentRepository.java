package com.example.degree_planner_tracker;

import org.springframework.data.jpa.repository.JpaRepository;

interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByStudentNo(Integer studentNo);
}
