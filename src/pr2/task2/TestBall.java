package pr2.task2;
import java.util.Scanner;
/*
По UML диаграмме класса, представленной на рис. 2.5 написать программу,
которая состоит из двух классов. Один из них Ball должен реализовывать сущность мяч,
а другой с названием TestBall тестировать работу созданного класса.
Класс Ball должен содержать реализацию методов, представленных на UML.
Диаграмма на рисунке описывает сущность Мяч
написать программу. Класс Ball моделирует движущийся мяч.
 */
public class TestBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координату x мяча:");
        double x = sc.nextDouble();
        System.out.println("Введите координату y мяча:");
        double y = sc.nextDouble();
        Ball ball = new Ball(x, y);
        System.out.println(ball);
        int i = 0;
        do{
            double xDisp;
            double yDisp;
            System.out.println("Если хотите завершить выполнение программы, введите нули,\n" +
                    "иначе введите, на сколько переместить мяч:");
            System.out.println("Введите, на сколько переместить мяч по оси x:");
            xDisp = sc.nextDouble();
            System.out.println("Введите, на сколько переместить мяч по оси y:");
            yDisp = sc.nextDouble();
            if (xDisp == 0 && yDisp == 0){
                break;
            }
            else{
                ball.move(xDisp, yDisp);
            }
            System.out.println(ball);
        } while (i==0);
    }
}