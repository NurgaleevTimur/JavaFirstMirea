package pr1;
import java.security.Signature;
import java.sql.SQLOutput;
import java.util.Scanner;
/*
Написать программу, в результате которой массив чисел создается с помощью инициализации (как в Си)
вводится и считается в цикле сумма элементов целочисленного массива, а также среднее арифметическое его
элементов результат выводится на экран. Использовать цикл for.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++){
            a[i] += sc.nextInt();
            sum += a[i];
        }
        System.out.format("Сумма чисел списка: %s", sum);
        System.out.printf("\nСреднее арифметическое чисел массива: %s", sum/5.0);
    }
}
