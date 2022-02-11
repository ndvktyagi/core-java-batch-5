package service;

import beans.Student;

public interface StudentService {
    String saveStudent(Student student);
    String updateStudent(Student student);
    String deleteStudent(int stuRollNumber);
    Student getStudentDetails(int stuRollNumber);
}
