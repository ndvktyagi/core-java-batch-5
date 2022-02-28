package repositry;

import beans.Student;

import java.lang.reflect.InvocationTargetException;

public interface StudentRepositry {
    String saveStudent(Student student);
    String updateStudent(Student student);
    String deleteStudent(int stuRollNumber);
    Student getStudentDetails(int stuRollNumber) throws InvocationTargetException, IllegalAccessException;
}
