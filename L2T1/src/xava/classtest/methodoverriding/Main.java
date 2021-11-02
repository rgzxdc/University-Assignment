package xava.classtest.methodoverriding;

public class Main {
    public static void main(String[] args) {
        xClass obj1 = new xClass();
        xClass obj2 = new yClass();

        obj1.methodX();
        obj2.methodX();
    }
}
