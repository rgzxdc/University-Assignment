package xava.classtest.rectangle;

public class Main {

    public static void main(String[] args) {

        Rectangle rac = new Rectangle(10, 5);
        Square sqr = new Square(5);

        rac.area();
        rac.perimeter();
        sqr.area();
        sqr.perimeter();
    }
}
