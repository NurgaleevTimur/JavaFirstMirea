package pr1;
import java.util.Scanner;
/*
Написать программу, в результате которой массив чисел вводится пользователем
с клавиатуры считается сумма элементов целочисленного массива с помощью циклов do while, while,
также необходимо найти максимальный и минимальный элемент в массиве, результат выводится на экран.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mini = 0;
        int maxi = 0;
        int sum = 0;
        int a = 1;
        do{
            System.out.println("Если хотите завершить программу, введите 0, иначе введите следующее целое число:");
            a = sc.nextInt();
            if (a!=0){
                mini = Math.min(a + 1, a);
                maxi = Math.max(a - 1, a);
                sum += a;
            }
        } while (a!=0);
        System.out.format("Сумма элементов массива: %s, минимальное число: %s, максимальное число: %s", sum, mini, maxi);
    }
}
