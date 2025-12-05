package com.student.attendance;

public class MainApp {

    public static void main(String[] args) {

        AttendanceDAO dao = new AttendanceDAO();

        // Sample objects (for demonstration only)
        Student s = new Student("Atharva Rahate", "Computer Technology");
        Attendance a = new Attendance(1, 30, 26);

        dao.save(s);
        dao.save(a);

        System.out.println("Mini Project setup completed successfully.");
    }
}
