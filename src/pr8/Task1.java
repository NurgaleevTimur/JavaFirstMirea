package pr8;
//Вариант 19
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count < n) {
                System.out.print(i + " ");
                    count++;
                }
                else{
                    break;
                }
            }
        }
    }
}
