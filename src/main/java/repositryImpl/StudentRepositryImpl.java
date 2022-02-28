package repositryImpl;

import beans.Student;
import entityBeans.StudentEntity;
import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import repositry.StudentRepositry;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class StudentRepositryImpl implements StudentRepositry {
    @Override
    public String saveStudent(Student student) {
        try {

           /* Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            //Statement stmt = con.createStatement();

            PreparedStatement stmt=con.prepareStatement("insert into Student values(?,?,?,?,?,?)");
            stmt.setInt(1,9);
            stmt.setString(2,student.getStuName());
            stmt.setString(3,student.getStuEmailId());
            stmt.setLong(4,student.getStuPhoneNumber());
            stmt.setInt(5,student.getStuCourse());
            stmt.setInt(6,student.getStuSectionId());

            int result = stmt.executeUpdate();*/
            //con.close();


            Configuration configuration = new Configuration();
            SessionFactory sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            Session session = sessionFactory.openSession();


            StudentEntity studentEntity = new StudentEntity();
            BeanUtils.copyProperties(studentEntity, student);

            session.beginTransaction();
            int result = (int) session.save(studentEntity);
            session.getTransaction().commit();

            session.close();
            sessionFactory.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return "Data Has been inserted successfully";
    }

    @Override
    public String updateStudent(Student student) {
        return "Data Has been updated successfully";
    }

    @Override
    public String deleteStudent(int stuRollNumber) {
        return "Data Has been deleted successfully";
    }

    @Override
    public Student getStudentDetails(int stuRollNumber) throws InvocationTargetException, IllegalAccessException {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        StudentEntity studentEntity = session.load(StudentEntity.class,stuRollNumber);
        Student student = new Student();
        //BeanUtils.copyProperties(student, studentEntity);
        return student;
    }
}
