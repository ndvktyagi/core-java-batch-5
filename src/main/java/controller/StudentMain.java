package controller;


import beans.Student;
import entityBeans.StudentEntity;
import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import repositry.StudentRepositry;
import repositryImpl.StudentRepositryImpl;
import service.StudentService;
import serviceImpl.StudentServiceImpl;

import java.lang.reflect.InvocationTargetException;

public class StudentMain {
    public static void main(String args[]) throws InvocationTargetException, IllegalAccessException {

        //Student student = new Student();

        StudentEntity student = new StudentEntity();
        student.setStuRollNumber(1002);
        student.setStuName("Anubhi Sharma");
        student.setStuEmailId("as@gmail.com");
        student.setStuPhoneNumber(9988776656L);
        student.setStuCourse(101);
        student.setStuSectionId(1);


        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        int result = (int) session.save(student);
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();

        /*StudentService studentService = new StudentServiceImpl();
        String result=studentService.saveStudent(student);
        System.out.println(result);

        student = studentService.getStudentDetails(1001);
        System.out.println(student);*/


    }
}
