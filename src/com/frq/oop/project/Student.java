package com.frq.oop.project;

import java.util.List;

public class Student {

    private final int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void enrollInCourse(List<Course> courseList) {
    }
    public void getGradeStudent(List<Course> courseList) {
    }
}
