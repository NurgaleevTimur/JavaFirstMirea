package pr7.task12;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите координаты верхней левой точки прямоугольника: ");
        System.out.print("x1 = ");
        int x1 = sc.nextInt();
        System.out.print("y1 = ");
        int y1 = sc.nextInt();

        MovableRectangle topLeft = new MovableRectangle(new MovablePoint(x1, y1));

        System.out.println("Введите координаты нижней правой точки прямоугольника: ");
        System.out.print("x2 = ");
        int x2 = sc.nextInt();
        System.out.print("y2 = ");
        int y2 = sc.nextInt();

        MovableRectangle bottomRight = new MovableRectangle(new MovablePoint(x2, y2));

        System.out.println(topLeft);
        System.out.println(bottomRight);

        System.out.println("Введите насколько передвинуть прямоугольник по оси икс и по оси игрек: ");
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("y = ");
        int y = sc.nextInt();

        if(x == 0 && y == 0) {
            System.out.println(topLeft);
            System.out.println(bottomRight);
        }else{
            if (x > 0) {
                topLeft.moveRight(x);
                bottomRight.moveRight(x);
                if (y > 0) {
                    topLeft.moveUp(y);
                    bottomRight.moveUp(y);
                }else {
                    topLeft.moveDown(y);
                    bottomRight.moveDown(y);
                }
            }else{
                topLeft.moveLeft(x);
                bottomRight.moveLeft(x);
                if(y < 0){
                    topLeft.moveDown(y);
                    bottomRight.moveDown(y);
                }else {
                    topLeft.moveUp(y);
                    bottomRight.moveUp(y);
                }
            }

            System.out.println(topLeft);
            System.out.println(bottomRight);
        }
    }
}
