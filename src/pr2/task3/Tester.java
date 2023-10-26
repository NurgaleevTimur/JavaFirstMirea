package pr2.task3;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Object[][] store = new Object[5][2];
        for (int i = 0; i < store.length; i++){
            System.out.println("Введите координату x центра окружности:");
            double x = sc.nextDouble();
            System.out.println("Введите координату y центра окружности:");
            double y = sc.nextDouble();
            System.out.println("Введите радиус окружности:");
            double r = sc.nextDouble();
            store[i][0] = new Circle(new Point(x, y), r);
            store[i][1] = i;
            System.out.format("Окружность №%d: %s\n", i+1, store[i][0]);
        }
    }
}