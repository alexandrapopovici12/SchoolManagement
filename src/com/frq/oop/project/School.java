package com.frq.oop.project;

import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private List<Course> courses;

    public School(List<Teacher> teachers, List<Student> students, List<Course> courses) {
        this.teachers = teachers;
        this.students = students;
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Teacher addTeacher(Teacher teacher)
    {
        teachers.add(teacher);
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
