package pr4_1.task8;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цвет фигуры");
        String color = sc.next();
        System.out.println("Фигура заполнена? (да/нет)");
        boolean filled = false;
        String s = sc.next();
        if (s.equals("да")){
            filled = true;
        }
        System.out.println("Введите тип фигуры (круг, прямоугольник или квадрат):");
        switch(sc.next()){
            case "круг":{
                System.out.println("Введите радиус круга:");
                double r = sc.nextDouble();
                Circle c = new Circle(r, color, filled);
                System.out.println(c);
                break;
            }
            case "прямоугольник":{
                System.out.println("Введите длину прямоугольника");
                double length = sc.nextDouble();
                System.out.println("Введите ширину прямоугольника");
                double width = sc.nextDouble();
                Rectangle r = new Rectangle(width, length, color, filled);
                System.out.println(r);
                break;
            }
            case "квадрат":{
                System.out.println("Введите длину стороны квадрата:");
                double side = sc.nextDouble();
                Square square = new Square(side, color, filled);
                System.out.println(square);
            }
        }
    }
}