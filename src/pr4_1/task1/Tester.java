package pr4_1.task1;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип фигуры (круг, прямоугольник, квадрат)");
        String type = sc.next();
        switch (type){
            case "круг":{
                System.out.println("Введите координату x точки центра круга:");
                double x = sc.nextDouble();
                System.out.println("Введите координату y точки центра круга:");
                double y = sc.nextDouble();
                System.out.println("Введите радиус круга:");
                double r = sc.nextDouble();
                Circle c = new Circle(r, new Point(x,y));
                System.out.println("Тип фигуры: "+c.getType());
                System.out.println("Площадь фигуры: "+c.getArea());
                System.out.println("Периметр фигуры: "+c.getPerimeter());
                break;
            }
            case "прямоугольник":{
                System.out.println("Введите координату x точки A прямоугольника:");
                double ax = sc.nextDouble();
                System.out.println("Введите координату y точки A прямоугольника:");
                double ay = sc.nextDouble();
                System.out.println("Введите координату x точки B прямоугольника:");
                double bx = sc.nextDouble();
                System.out.println("Введите координату y точки B прямоугольника:");
                double by = sc.nextDouble();
                System.out.println("Введите координату x точки C прямоугольника:");
                double cx = sc.nextDouble();
                System.out.println("Введите координату y точки C прямоугольника:");
                double cy = sc.nextDouble();
                Rectangle r = new Rectangle(new Point(ax, ay), new Point(bx, by), new Point(cx, cy));
                System.out.println("Тип фигуры: "+r.getType());
                System.out.println("Площадь фигуры: "+r.getArea());
                System.out.println("Периметр фигуры: "+r.getPerimeter());
                break;
            }
            case "квадрат":{
                System.out.println("Введите координату x точки A квадрата:");
                double ax = sc.nextDouble();
                System.out.println("Введите координату y точки A квадрата:");
                double ay = sc.nextDouble();
                System.out.println("Введите координату x точки С квадрата:");
                double cx = sc.nextDouble();
                System.out.println("Введите координату y точки С квадрата:");
                double cy = sc.nextDouble();
                Square s = new Square(new Point(ax, ay), new Point(cx, cy));
                System.out.println("Тип фигуры: "+s.getType());
                System.out.println("Площадь фигуры: "+s.getArea());
                System.out.println("Периметр фигуры: "+s.getPerimeter());
            }
        }
    }
}