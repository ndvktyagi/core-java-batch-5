package oops;

public class Student {
     private int stuRollNo;
     private String stuName;

    //Getter and Setter

    public void setStuRollNo(int stuRollNo){
        this.stuRollNo=stuRollNo;
    }

    //getter
    public int getStuRollNo(){
        return this.stuRollNo;
    }

    // Setter
    public void setStuName(String stuName){
        this.stuName=stuName;
    }

    public String getStuName(){
        return this.stuName;
    }

    void printData(){
        System.out.println("Name:-"+stuName+"   Roll Number:-"+stuRollNo);
    }

}
