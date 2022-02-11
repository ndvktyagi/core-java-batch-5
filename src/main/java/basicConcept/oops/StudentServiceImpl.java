package basicConcept.oops;

public class StudentServiceImpl implements OperationService {

    public void add(Student student){
        System.out.println("Data has been Inserted Successfully for Student.");
    }

    public void update(Student student){
        System.out.println("Data has been Updated Successfully  Student.");
    }

    public void delete(int stuRollNo){
        System.out.println("Data has been Deleted Successfully Student.");
    }

    public void showData() {

    }

    public void extraMethod(int stuRollNo){
        System.out.println("Data has been Deleted Successfully.");
    }
}
