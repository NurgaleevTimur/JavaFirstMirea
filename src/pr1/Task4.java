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
        int mini = 10000;
        int maxi = -10000;
        int summ = 0;
        int a=1;
        do{
            System.out.println("Если хотите завершить программу, введите 0, инаые введите следующее целое число:");
            a = sc.nextInt();
            if (a!=0) {
                mini = Math.min(mini, a);
                maxi = Math.max(maxi, a);
                summ += a;
            }
        } while (a!=0);
        System.out.format("Сумма элементов массива: %s, минимальное число: %s, максимальное число: %s", summ, mini, maxi);
    }
}
