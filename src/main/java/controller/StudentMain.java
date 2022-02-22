package controller;


import beans.Student;
import service.StudentService;
import serviceImpl.StudentServiceImpl;

public class StudentMain {
    public static void main(String args[]){

        Student student = new Student();
        student.setStuName("Vishal Tyagi");
        student.setStuEmailId("vishaltyagi11187@gmail.com");
        student.setStuPhoneNumber(9910455253L);
        student.setStuCourse(101);
        student.setStuSectionId(1);

        StudentService studentService = new StudentServiceImpl();
        String result=studentService.saveStudent(student);
        System.out.println(result);

    }
}
