package entityBeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {

    @Id
    @Column(name="stu_id")
    int stuRollNumber;

    @Column(name="stu_name")
    String stuName;

    @Column(name="stu_email_id")
    String stuEmailId;

    @Column(name="stu_phone")
    Long stuPhoneNumber;

    @Column(name="stu_course")
    int stuCourse;

    @Column(name="stu_section_id")
    int stuSectionId;

    public int getStuRollNumber() {
        return stuRollNumber;
    }

    public void setStuRollNumber(int stuRollNumber) {
        this.stuRollNumber = stuRollNumber;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuEmailId() {
        return stuEmailId;
    }

    public void setStuEmailId(String stuEmailId) {
        this.stuEmailId = stuEmailId;
    }

    public Long getStuPhoneNumber() {
        return stuPhoneNumber;
    }

    public void setStuPhoneNumber(Long stuPhoneNumber) {
        this.stuPhoneNumber = stuPhoneNumber;
    }

    public int getStuCourse() {
        return stuCourse;
    }

    public void setStuCourse(int stuCourse) {
        this.stuCourse = stuCourse;
    }

    public int getStuSectionId() {
        return stuSectionId;
    }

    public void setStuSectionId(int stuSectionId) {
        this.stuSectionId = stuSectionId;
    }
}
