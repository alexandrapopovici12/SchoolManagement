package com.frq.oop.project;

import java.util.List;

public class Teacher {
    private int id;
    private String name;
    private List<Course> courseList;
    private List<Attendance> attendanceList;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void teachCourse(int numberOfCourse) {
    }
    public void gradeStudent(int studentGrade) {
    }
    public void defineCurricula(Course course)
    {
        course.setCourseCurricula(true);
    }
    public List<Attendance> checkAttendance(List<Attendance> attendanceList)
    {
        return attendanceList;
    }
}
