package repositryImpl;

import beans.Student;
import repositry.StudentRepositry;

import java.sql.*;

public class StudentRepositryImpl implements StudentRepositry {
    @Override
    public String saveStudent(Student student) {
        try {

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            //Statement stmt = con.createStatement();

            PreparedStatement stmt=con.prepareStatement("insert into Student values(?,?,?,?,?,?)");
            stmt.setInt(1,9);
            stmt.setString(2,student.getStuName());
            stmt.setString(3,student.getStuEmailId());
            stmt.setLong(4,student.getStuPhoneNumber());
            stmt.setInt(5,student.getStuCourse());
            stmt.setInt(6,student.getStuSectionId());

            int i=stmt.executeUpdate();

            con.close();

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
    public Student getStudentDetails(int stuRollNumber) {
        return null;
    }
}
