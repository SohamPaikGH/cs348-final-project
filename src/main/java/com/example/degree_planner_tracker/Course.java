package com.example.degree_planner_tracker;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "Course")
public class Course {

    @Id
    @Column(name = "course_no")
    @Positive(message = "Course number must be positive")
    private Integer courseNo;

    @Column(name = "course_code", nullable = false, unique = true, length = 15)
    @NotBlank(message = "Every course must have a course code")
    private String courseCode;

    @Column(name = "course_name", nullable = false)
    @NotBlank(message = "Every course must have a course name")
    private String courseName;

    @Column(name = "dept_no", nullable = false)
    @NotNull(message = "Every course must be taught by a certain department")
    private Integer deptNo;

    @Column(name = "credits", nullable = false)
    @NotNull(message = "Every course must be worth a certain amount of credits")
    private Integer credits;

    @Column(name = "description", nullable = true, length = 800)
    private String description;

    public Course() {

    }

    public Course(Integer courseNo, String courseCode, Integer deptNo, Integer credits, String description) {
        this.courseNo = courseNo;
        this.courseCode = courseCode;
        this.deptNo = deptNo;
        this.credits = credits;
        this.description = description;
    }

    public Integer getCourseNo() {
        return courseNo;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public Integer getCredits() {
        return credits;
    }

    public String getDescription() {
        return description;
    }

    public void setCourseNo(Integer courseNo) {
        this.courseNo = courseNo;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
