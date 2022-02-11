package basicConcept.oops.overloading;

public class AreaCalculate {

    // Area of rectangle with long
    long area(long length, int width){
        System.out.println("LONG method called");
        long areaValue=length*width;
        return areaValue;
    }

    // Area of rectangle with int
    long area(int length, long width){
        System.out.println("INT method called");
        long areaValue=length*width;
        return areaValue;
    }

    // Area of Square
    int area(int side){
        int areaValue=side*side;
        return areaValue;
    }

    // Area of Circle
    double area(double radius){
        double areaValue=3.14*radius*radius;
        return areaValue;
    }


}
