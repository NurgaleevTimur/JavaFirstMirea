package pr1;
import java.util.Scanner;
/*
Написать программу, которая с помощью метода класса, вычисляет факториал числа
(использовать управляющую конструкцию цикла), проверить
работу метода.
 */
public class Task7 {
    private static int factorial(int a){
        if (a == 1 || a == 0){
            return 1;
        }
        else{
            return factorial(a-1)*a;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = sc.nextInt();
        System.out.format("!%s =  %s", a, factorial(a));
    }
}
