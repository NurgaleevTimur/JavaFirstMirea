package pr18_24.pr18;
import java.util.Scanner;
public class Task2 {
    public void exceptionDemo() {

        int i;
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            i = Integer.parseInt(intString);
        }
        System.out.println(2 / i);
    }

    public void exceptionDemo2() {
        try {
            int i;
            try (Scanner myScanner = new Scanner(System.in)) {
                System.out.print("Enter an integer ");
                String intString = myScanner.next();
                i = Integer.parseInt(intString);
            }
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Not correct number");
        }
    }

    public static void main(String[] args) {
        Task2 e2 = new Task2();
        e2.exceptionDemo2();
        e2.exceptionDemo();
    }
}
