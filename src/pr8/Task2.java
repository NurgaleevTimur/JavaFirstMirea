package pr8;
//Вариант 19
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt(); // Ввод числа n

        for (int i = 1; i <= n; i++) {
            System.out.println(i); // Выводим числа от 1 до n
        }
    }
}
