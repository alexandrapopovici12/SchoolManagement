package com.frq.oop.project;

import java.util.List;

public class Course {
    private final int courseId;
    public boolean courseCurricula;
    private Attendance attendance;
    private Grade grade;

    public Course(int courseId) {
        this.courseId = courseId;
    }

    //Course ID
    public int getCourseId() {
        return courseId;
    }
    //operations for Teacher
    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean getCourseCurricula() {
        return courseCurricula; // if the Teacher wants to check the curricula
    }

    public void setCourseCurricula(boolean courseCurricula) {
        this.courseCurricula = courseCurricula;
    }

    //operations for Students - to see the attendance and the grade
    public Attendance getAttendance() {
        return attendance;
    }

    public Grade getGrade() {
        return grade;
    }
}

