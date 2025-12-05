# Student Attendance Management System  
### Mini Project – Java Full Stack Development  

**Name:** Atharva Rahate  
**Roll No:** 41  
**Sem, Class:** 5th, CT-A  
**Branch:** Computer Technology  
**Subject:** Java FSD (Module 1: Maven, Module 2: Hibernate)

---

## 📌 Overview  
The **Student Attendance Management System** is a simple backend mini-project that demonstrates how to use **Maven** for project management and **Hibernate ORM** for database interactions.  
The system stores student details, attendance records, and calculates attendance percentage using Hibernate’s persistence mechanisms.

This project is backend-only and showcases practical knowledge of Hibernate configuration, entity mapping, and session handling.

---

## 🧾 Problem Statement  
Educational institutions need a basic system to maintain student attendance efficiently.  
The aim of this project is to create a Java-based model that:

- Stores student data  
- Stores attendance data  
- Computes attendance percentage  
- Demonstrates integration of Maven + Hibernate  

---

## 🛠️ Technologies Used  
- **Java (JDK 8+)**  
- **Maven** (Dependency Management)  
- **Hibernate ORM**  
- **MySQL Database**  
- **JPA Annotations**  

---

## 📁 Project Structure

```txt
MiniProject-JavaFSD/
 ├── pom.xml
 ├── README.md
 └── src/
     └── main/
         ├── java/
         │   └── com/student/attendance/
         │        ├── Student.java
         │        ├── Attendance.java
         │        ├── AttendanceDAO.java
         │        ├── HibernateUtil.java
         │        └── MainApp.java
         └── resources/
             └── hibernate.cfg.xml
```

---

## 📌 Key Features  
- Add new student data  
- Store attendance information  
- Calculate attendance percentage  
- Map Java objects to database tables  
- Simple DAO layer using Hibernate  

---

## 📚 Hibernate Features Demonstrated  
- SessionFactory Configuration  
- Entity Mapping (`@Entity`, `@Table`, `@Id`)  
- Automatic table creation (`hbm2ddl.auto=update`)  
- Saving objects to database  
- Fetching records using HQL  

---

## 📊 Sample Console Output  
Mini Project setup completed successfully.
Sample student and attendance records inserted.


---

## 🎯 Learning Outcomes  
✔ Understanding of Maven project structure  
✔ Hibernate setup and configuration  
✔ Java–Database integration  
✔ Working with ORM and entity classes  
✔ Basic backend system architecture  

---

## 🔗 Repository  
This mini project is included under my main lab repository:  
**Lab-JavaFSD → MiniProject**

---

## ✔ Conclusion  
This project successfully demonstrates the integration of Maven and Hibernate in Java FSD.  
It provides a simple backend model for managing attendance while fulfilling all academic requirements of Module 1 and Module 2.
