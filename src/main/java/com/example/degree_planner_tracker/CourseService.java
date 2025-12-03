package com.example.degree_planner_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseByNo(Integer courseNo) {
        return courseRepository.findByCourseNo(courseNo);
    }
}
