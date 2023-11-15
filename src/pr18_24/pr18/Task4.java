package pr18_24.pr18;
import java.util.Scanner;
public class Task4 {
    public void exceptionDemo() {
        try {
            int i;
            try (Scanner myScanner = new Scanner(System.in)) {
                System.out.print("Enter an integer ");
                String intString = myScanner.next();
                i = Integer.parseInt(intString);
            }
            System.out.println(2 / i);
        } catch (NumberFormatException e){             // Compile error: NumberFormatException already catched
            System.out.println("Not correct number");
        } catch(Exception e) {
            System.out.println("Exception happened!");
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        Task4 e2 = new Task4();
        e2.exceptionDemo();
    }
}
