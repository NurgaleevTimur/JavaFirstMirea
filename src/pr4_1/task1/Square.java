package pr4_1.task1;
public class Square extends Shape{
    private Point point1;
    private Point point2;

    public Square(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
    public double getArea(){
        return Math.pow(point1.getX()- point2.getX(), 2);
    }
    public double getPerimeter(){
        return 4*Math.abs(point1.getX()-point2.getX());
    }
    @Override
    public String getType(){
        return "Квадрат";
    }
}
