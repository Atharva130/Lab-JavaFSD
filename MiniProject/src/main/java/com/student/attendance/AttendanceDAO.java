package com.student.attendance;

import org.hibernate.*;
import java.util.List;

public class AttendanceDAO {

    public void save(Object obj) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(obj);
        tx.commit();
        session.close();
    }

    public List<Attendance> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Attendance> list = session.createQuery("from Attendance").list();
        session.close();
        return list;
    }
}
