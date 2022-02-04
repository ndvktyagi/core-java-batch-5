package oops;

public class MainTest {
    public static void main(String args[]){
        Student student1 = new Student();
        /*student1.stuRollNo=102;
        student1.stuName="Ankur Tyagi";*/

        student1.setStuRollNo(101);
        student1.setStuName("Ankur Tyagi");

        /*Student student2 = new Student();
        student2.setStuRollNo(102);
        student2.setStuName("Anubhi Sharma");*/

        student1.printData(); // 101- Ankur Sharma
        //student2.printData(); // 102- Anubhi Sharma



    }
}
