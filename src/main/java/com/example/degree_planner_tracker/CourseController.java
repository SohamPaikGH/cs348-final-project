package com.example.degree_planner_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @GetMapping("/{courseNo}")
    public Course getCourse(@PathVariable("courseNo") Integer courseNo) {
        return courseRepository.findByCourseNo(courseNo);
    }
}
