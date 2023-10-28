package pr8;

public class Task4 {
    public static void main(String[] args) {
        int k = 3; // Задаем значение k (количество цифр)

        int s = 9; // Задаем значение s (сумма цифр)

        int d = 5; // Задаем значение d (искомая сумма цифр)

        int count = findCountOfNumbers(k, s, d);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + d + ": " + count);
    }

    public static int findCountOfNumbers(int k, int s, int d) {
        if (s > k * 9 || d > s) {
            return 0;
        }

        if (k == 1) {
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= 9; i++) {
            if (s - i >= 0) {
                count += findCountOfNumbers(k - 1, s - i, d);
            }
        }

        return count;
    }
}