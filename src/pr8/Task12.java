package pr8;

import java.util.Scanner;

public class Task12 {

    public static void rec() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
        }
        rec();
    }

    public static void main(String[] args) {
        rec();
    }
}