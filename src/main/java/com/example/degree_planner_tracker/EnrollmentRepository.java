package com.example.degree_planner_tracker;

import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentId> {
    List<Enrollment> findById_StudentNo(Integer idStudentNo);
//    List<EnrollmentDTO> findAllWithCourseCode();
}
