package xava.exam.quiz2.q3;

abstract class Vehicle{
    protected String model;
    public Vehicle(String model) {
        this.model = model;
    }
    public abstract void display();
}
interface Driver{
    public void startEngine();
    public void stopEngine();
}

public class Volvo extends Vehicle implements Driver{
     private double price;
    public Volvo( double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("This is display method");
    }
    public void startEngine() {
        System.out.println("This is startEngine method");
    }

    public void stopEngine() {
        System.out.println("This is stopEngine method");
    }

    public static void main(String[] args) {

        System.out.println("This is main method");
    }
}
