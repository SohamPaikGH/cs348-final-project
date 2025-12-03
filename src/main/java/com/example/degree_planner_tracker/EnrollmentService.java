package com.example.degree_planner_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment enrollStudentInCourse(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public Enrollment updateEnrollment(EnrollmentId oldEnrollmentId, Enrollment newEnrollment) {
        if (enrollmentRepository.existsById(oldEnrollmentId)) {
            enrollmentRepository.deleteById(oldEnrollmentId);
        }
        else {
            System.out.println("Warning: Could not find enrollment with id " + oldEnrollmentId);
        }

        return enrollmentRepository.save(newEnrollment);
    }

    public List<Enrollment> getEnrollments() {
        return enrollmentRepository.findAll();
    }

    public Enrollment getEnrollmentById(Integer studentNo, Integer courseNo, String semester, Integer year) {
        EnrollmentId enrollmentId = new EnrollmentId(studentNo, courseNo, semester, year);
        return enrollmentRepository.findById(enrollmentId).orElse(null);
    }

    public void deleteEnrollmentById(Integer studentNo, Integer courseNo, String semester, Integer year) {
        EnrollmentId id = new EnrollmentId(studentNo, courseNo, semester, year);
        enrollmentRepository.deleteById(id);
    }

    public List<Enrollment> getEnrollmentsByStudentNo(Integer studentNo) {
        return enrollmentRepository.findById_StudentNo(studentNo);
    }
    
}
