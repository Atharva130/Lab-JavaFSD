package com.student.attendance;

import javax.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int studentId;
    private int totalClasses;
    private int presentClasses;

    public Attendance() {}

    public Attendance(int studentId, int totalClasses, int presentClasses) {
        this.studentId = studentId;
        this.totalClasses = totalClasses;
        this.presentClasses = presentClasses;
    }

    public double getPercentage() {
        return (presentClasses * 100.0) / totalClasses;
    }

    // getters and setters

    public int getId() { return id; }
    public int getStudentId() { return studentId; }
    public int getTotalClasses() { return totalClasses; }
    public int getPresentClasses() { return presentClasses; }

    public void setStudentId(int id) { this.studentId = id; }
    public void setTotalClasses(int t) { this.totalClasses = t; }
    public void setPresentClasses(int p) { this.presentClasses = p; }
}
