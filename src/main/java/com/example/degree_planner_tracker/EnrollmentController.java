package com.example.degree_planner_tracker;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/enrollments")
public  class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping
    public List<Enrollment> getEnrollments() {
        return enrollmentService.getEnrollments();
    }

    @GetMapping("/{studentNo}")
    public List<Enrollment> getEnrollmentsByStudentNo(@PathVariable Integer studentNo) {
        return enrollmentService.getEnrollmentsByStudentNo(studentNo);
    }
    
    @GetMapping("/{studentNo}/{courseNo}/{semester}/{year}")
    public Enrollment getEnrollmentById(
            @PathVariable Integer studentNo,
            @PathVariable Integer courseNo,
            @PathVariable String semester,
            @PathVariable Integer year
    ) {
        return enrollmentService.getEnrollmentById(studentNo, courseNo, semester, year);
    }

    @PostMapping
    public Enrollment enrollStudent(@RequestBody Enrollment enrollment) {
        enrollmentService.enrollStudentInCourse(enrollment);
        return enrollment;
    }

    @PutMapping("/update")
    public ResponseEntity<Enrollment> updateEnrollment(@RequestBody EnrollmentUpdateDto enrollmentUpdateDto) {
        try {
            Enrollment updated = enrollmentService.updateEnrollment(enrollmentUpdateDto.getEnrollmentId(),
                    enrollmentUpdateDto.getNewEnrollment());

            return ResponseEntity.ok(updated);
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{studentNo}/{courseNo}/{semester}/{year}")
    public void deleteEnrollmentById(
            @PathVariable Integer studentNo,
            @PathVariable Integer courseNo,
            @PathVariable String semester,
            @PathVariable Integer year
    ) {
        enrollmentService.deleteEnrollmentById(studentNo, courseNo, semester, year);
    }
}
