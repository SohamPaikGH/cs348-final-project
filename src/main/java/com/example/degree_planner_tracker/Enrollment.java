package com.example.degree_planner_tracker;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Enrollments")
public class Enrollment {

    @EmbeddedId
    private EnrollmentId id;

    @ManyToOne
    @JoinColumn(name = "student_no", insertable = false, updatable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_no", insertable = false, updatable = false)
    private Course course;

    public Enrollment() {}

    public Enrollment(EnrollmentId id) {
        this.id = id;
    }

    public EnrollmentId getId() { return id; }

    public Student getStudent() { return student; }

    public Course getCourse() { return course; }

    public void setId(EnrollmentId id) { this.id = id; }
}
