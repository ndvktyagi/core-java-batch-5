package service;

import beans.Student;
import entityBeans.StudentEntity;

import java.lang.reflect.InvocationTargetException;

public interface StudentService {
    String saveStudent(Student student) throws InvocationTargetException, IllegalAccessException;
    String updateStudent(Student student);
    String deleteStudent(int stuRollNumber);
    Student getStudentDetails(int stuRollNumber) throws InvocationTargetException, IllegalAccessException;
}
