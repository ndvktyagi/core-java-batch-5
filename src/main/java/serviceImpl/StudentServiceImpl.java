package serviceImpl;

import beans.Student;
import entityBeans.StudentEntity;
import org.apache.commons.beanutils.BeanUtils;
import repositry.StudentRepositry;
import repositryImpl.StudentRepositryImpl;
import service.StudentService;

import java.lang.reflect.InvocationTargetException;

public class StudentServiceImpl implements StudentService {

    StudentRepositry studentRepositry = new StudentRepositryImpl();

    @Override
    public String saveStudent(Student student) throws InvocationTargetException, IllegalAccessException {
        // Calculation

        StudentEntity studentEntity = new StudentEntity();
        BeanUtils.copyProperties(studentEntity, student);

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
    public Student getStudentDetails(int stuRollNumber) throws InvocationTargetException, IllegalAccessException {
        return studentRepositry.getStudentDetails(stuRollNumber);
    }
}
