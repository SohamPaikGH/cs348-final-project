package com.example.degree_planner_tracker;

public class EnrollmentUpdateDto {
    private EnrollmentId enrollmentId;
    private Enrollment newEnrollment;

    public EnrollmentUpdateDto() {}

    public EnrollmentUpdateDto(EnrollmentId enrollmentId, Enrollment newEnrollment) {
        this.enrollmentId = enrollmentId;
        this.newEnrollment = newEnrollment;
    }

    public EnrollmentId getEnrollmentId() {
        return enrollmentId;
    }

    public Enrollment getNewEnrollment() {
        return newEnrollment;
    }

    public void setEnrollmentId(EnrollmentId enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public void setNewEnrollment(Enrollment newEnrollment) {
        this.newEnrollment = newEnrollment;
    }
}
