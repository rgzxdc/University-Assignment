package xava.classtest.rectangle;

public class Rectangle {

    public double length;
    public double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area: "+ (length*breadth));
    }

    public void perimeter() {
        System.out.println("Perimeter: "+ ((2)*(length*breadth)));
    }

}
