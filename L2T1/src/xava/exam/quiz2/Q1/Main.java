package xava.exam.quiz2.Q1;

    interface A {
        public void method();
    }
    class One{
        public void method() {
            System.out.println("Class One Method");
        }
    }
    class Two extends One implements A{
        public void method() {
            System.out.println("Class Two method");
        }
    }
    public class Main extends Two{
        public static void main(String[] args) {
            A a = new Two();
            a.method();
        }
    }
