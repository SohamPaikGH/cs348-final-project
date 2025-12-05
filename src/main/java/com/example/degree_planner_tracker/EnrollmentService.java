package com.example.degree_planner_tracker;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Transactional
    public Enrollment enrollStudentInCourse(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @Transactional
    public Enrollment updateEnrollment(EnrollmentId oldEnrollmentId, Enrollment newEnrollment) {
        if (enrollmentRepository.existsById(oldEnrollmentId)) {
            enrollmentRepository.deleteById(oldEnrollmentId);
        }
        else {
            System.out.println("Warning: Could not find enrollment with id " + oldEnrollmentId);
        }

        return enrollmentRepository.save(newEnrollment);
    }

    @Transactional
    public List<Enrollment> getEnrollments() {
        return enrollmentRepository.findAll();
    }

    @Transactional
    public Enrollment getEnrollmentById(Integer studentNo, Integer courseNo, String semester, Integer year) {
        EnrollmentId enrollmentId = new EnrollmentId(studentNo, courseNo, semester, year);
        if (!enrollmentRepository.existsById(enrollmentId)) {
            System.out.println("Warning: Could not find enrollment with id " + enrollmentId);
            return null;
        }
        return enrollmentRepository.findById(enrollmentId).orElse(null);
    }

    @Transactional
    public void deleteEnrollmentById(Integer studentNo, Integer courseNo, String semester, Integer year) {
        EnrollmentId id = new EnrollmentId(studentNo, courseNo, semester, year);
        if (!enrollmentRepository.existsById(id)) {
            enrollmentRepository.deleteById(id);
        }
        else {
            System.out.println("Warning: Could not find enrollment with id " + id);
        }
    }

    @Transactional
    public List<Enrollment> getEnrollmentsByStudentNo(Integer studentNo) {
        return enrollmentRepository.findById_StudentNo(studentNo);
    }
    
}
