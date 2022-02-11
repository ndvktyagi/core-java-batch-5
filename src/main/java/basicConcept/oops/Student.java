package basicConcept.oops;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private int stuRollNo;
    private String stuName;
    private LocalDate stuDob;

    public Student() {
    }

    public Student(int stuRollNo, String stuName, LocalDate stuDob) {
        this.stuRollNo = stuRollNo;
        this.stuName = stuName;
        this.stuDob = stuDob;
    }

    public int getStuRollNo() {
        return stuRollNo;
    }

    public void setStuRollNo(int stuRollNo) {
        this.stuRollNo = stuRollNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuDob() {
        int stuDobYear = this.stuDob.getYear();
        LocalDate localDate=LocalDate.now();
        int currentYear=localDate.getYear();
        int age = currentYear-stuDobYear;
        return age;
    }

    public void setStuDob(LocalDate stuDob) {
        this.stuDob = stuDob;
    }
}
