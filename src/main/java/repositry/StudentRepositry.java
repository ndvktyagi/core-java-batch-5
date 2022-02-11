package repositry;

import beans.Student;

public interface StudentRepositry {
    String saveStudent(Student student);
    String updateStudent(Student student);
    String deleteStudent(int stuRollNumber);
    Student getStudentDetails(int stuRollNumber);
}
