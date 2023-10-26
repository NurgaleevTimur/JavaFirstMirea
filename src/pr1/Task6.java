package pr1;
/*
Написать программу, в результате работы которой
выводятся на экран первые 10 чисел гармонического ряда (форматировать вывод).
 */
public class Task6 {
    public static void main(String[] args) {
        double garmonicelement = 0;
        for (int i = 1; i <= 10; i++){
            garmonicelement = 1.0/i;
            System.out.format("Humber %s: %s \n", i, garmonicelement);
        }
    }
}
