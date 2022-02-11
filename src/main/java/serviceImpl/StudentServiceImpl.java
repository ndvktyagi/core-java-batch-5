package serviceImpl;

import beans.Student;
import repositry.StudentRepositry;
import repositryImpl.StudentRepositryImpl;
import service.StudentService;

public class StudentServiceImpl implements StudentService {

    StudentRepositry studentRepositry = new StudentRepositryImpl();

    @Override
    public String saveStudent(Student student) {
        // Calculation
        String result=studentRepositry.saveStudent(student);
        return result;
    }

    @Override
    public String updateStudent(Student student) {
        String result=studentRepositry.updateStudent(student);
        return result;
    }

    @Override
    public String deleteStudent(int stuRollNumber) {
        String result=studentRepositry.deleteStudent(stuRollNumber);
        return result;
    }

    @Override
    public Student getStudentDetails(int stuRollNumber) {
        return null;
    }
}
