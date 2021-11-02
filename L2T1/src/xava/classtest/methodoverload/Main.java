package xava.classtest.methodoverload;

public class Main {
    public static void main(String[] args) {
        newxy xy = new newxy();

        xy.aMethod(5,5);
        xy.aMethod(5,6,7);
        xy.aMethod(11.99);
        xy.aMethod(4.44f);
    }

}
