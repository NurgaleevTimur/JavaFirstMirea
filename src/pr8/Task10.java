package pr8;

import java.util.Scanner;
public class Task10 {
    public static int fin(int num1, int num2){
        num1+=num2%10;
        num2/=10;
        if(num2==0){
            return num1;
        }
        else{
            return fin(num1*10, num2);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int num = sc.nextInt();
        System.out.println("Перевернутое число: " + fin(0, num));
    }
}
