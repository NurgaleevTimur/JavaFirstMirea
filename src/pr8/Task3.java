package pr8;
//Вариант 19
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int A = scanner.nextInt(); // Ввод числа A

        System.out.print("Введите число B: ");
        int B = scanner.nextInt(); // Ввод числа B

        if(A < B){
            for (int i = A; i <= B; i++) {
                System.out.println(i); // Выводим числа от A до B
            }
        }
        else{
            for(int i = A; i >= B; i--){
                System.out.println(i); // Выводим числа от B до A
            }
        }
    }
}
