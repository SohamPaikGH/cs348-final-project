package com.example.degree_planner_tracker;

import jakarta.persistence.*;
@Entity
@Table(name = "Student")
public class Student {

    @Id
    @Column(name = "student_no")
    private Integer studentNo;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "total_gpa", nullable = false)
    private Double totalGpa;

    @Column(name = "credits_taken", nullable = false)
    private Integer creditsTaken;

    public Student() {}

    public Student(Integer studentNo, String firstName, String lastName) {
        this.studentNo = studentNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalGpa = 0.0;
        this.creditsTaken = 0;
    }

    // Getters
    public Integer getStudentNo() {
        return studentNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getTotalGpa() {
        return totalGpa;
    }

    public Integer getCreditsTaken() {
        return creditsTaken;
    }

    // Setters
    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTotalGpa(Double totalGpa) {
        this.totalGpa = totalGpa;
    }

    public void setCreditsTaken(Integer creditsTaken) {
        this.creditsTaken = creditsTaken;
    }
}
