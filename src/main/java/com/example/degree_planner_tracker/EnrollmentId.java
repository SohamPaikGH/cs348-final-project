package com.example.degree_planner_tracker;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class EnrollmentId implements Serializable {

    @Column(name = "student_no", nullable = false)
    private Integer studentNo;

    @Column(name = "course_no", nullable = false)
    private Integer courseNo;

    @Column(name = "semester", nullable = false, length = 10)
    private String semester;

    @Column(name = "year", nullable = false)
    private Integer year;

    // No-args constructor (required by JPA)
    public EnrollmentId() {}

    // All-args constructor
    public EnrollmentId(Integer studentNo, Integer courseNo, String semester, Integer year) {
        this.studentNo = studentNo;
        this.courseNo = courseNo;
        this.semester = semester;
        this.year = year;
    }

    public Integer getStudentNo() { return studentNo; }
    public Integer getCourseNo() { return courseNo; }
    public String getSemester() { return semester; }
    public Integer getYear() { return year; }

    public void setStudentNo(Integer studentNo) { this.studentNo = studentNo; }
    public void setCourseNo(Integer courseNo) { this.courseNo = courseNo; }
    public void setSemester(String semester) { this.semester = semester; }
    public void setYear(Integer year) { this.year = year; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnrollmentId)) return false;
        EnrollmentId that = (EnrollmentId) o;
        return Objects.equals(studentNo, that.studentNo) &&
                Objects.equals(courseNo, that.courseNo) &&
                Objects.equals(semester, that.semester) &&
                Objects.equals(year, that.year);  // Add year to equals!
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNo, courseNo, semester, year);  // Add year to hashCode!
    }
}