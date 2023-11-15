package pr18_24.pr18;

public class Task1 {
    public void exceptionDemo() {
        System.out.println(2 / 0);
    }

    public void exceptionDemo2() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Task1 e1 = new Task1();
        e1.exceptionDemo2();
        e1.exceptionDemo();

    }
}
