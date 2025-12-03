package com.example.degree_planner_tracker;

public class EnrollmentDTO {
    public int studentNo;
    public String courseCode;
    public int semester;
    public int year;

    public EnrollmentDTO(int studentNo, String courseCode, int semester, int year) {
        this.studentNo = studentNo;
        this.courseCode = courseCode;
        this.semester = semester;
        this.year = year;
    }
}
