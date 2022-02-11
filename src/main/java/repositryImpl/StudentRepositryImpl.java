package repositryImpl;

import beans.Student;
import repositry.StudentRepositry;

public class StudentRepositryImpl implements StudentRepositry {
    @Override
    public String saveStudent(Student student) {
        // code for saving data in DB
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
