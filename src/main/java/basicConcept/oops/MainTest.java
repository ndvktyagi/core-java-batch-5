package basicConcept.oops;

import java.time.LocalDate;

public class MainTest {
    public static void main(String args[]){
        Student student1 = new Student();
        System.out.println(student1.getStuRollNo()+"     "+student1.getStuName());

        Student student2 = new Student(102,"Vipul Tyagi Ji",LocalDate.now());
        System.out.println(student2.getStuRollNo()+"     "+student2.getStuName()+"   "+student2.getStuDob());

        student1.setStuRollNo(101);
        student1.setStuName("Ankur Tyagi");
        student1.setStuDob(LocalDate.now().minusYears(25));
        System.out.println(student1.getStuRollNo()+"     "+student1.getStuName()+"   "+student1.getStuDob());


        OperationService operationervice1 = new StudentServiceImpl();
        OperationService operationervice2 = new TeacherServiceImpl();

        //Operationervice operationervice3 = new Operationervice();

        operationervice1.add(student1);
        operationervice2.add(student1);



    }
}
