package xava.classtest.methodoverload;

public class newxy {

    public void aMethod(int x) {
        System.out.println("our number: " + x);
    }
    void aMethod(int x, int y) {
        System.out.println("our number: " + x + " and " + y);
    }
    void aMethod(int x, int y, int z) {
        System.out.println("our number: " + x +", " + y + " and "+ z);
    }

    float aMethod(float x) {
        System.out.println("Float :"+ x);
        return x;
    }

    double aMethod(double x) {
        System.out.println("our number: " + x);
        return (x);
    }

}
