package com.example.degree_planner_tracker;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface CourseRepository extends JpaRepository<Course, Integer> {
    Course findByCourseNo(Integer courseNo);
}
