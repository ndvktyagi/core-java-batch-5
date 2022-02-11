package basicConcept.oops;

public class TeacherServiceImpl implements OperationService {

    public void add(Student student){
        System.out.println("Data has been Inserted Successfully Teacher.");
    }

    public void update(Student student){
        System.out.println("Data has been Updated Successfully Teacher.");
    }

    public void delete(int stuRollNo){
        System.out.println("Data has been Deleted Successfully Teacher.");
    }

    public void showData() {

    }

}
