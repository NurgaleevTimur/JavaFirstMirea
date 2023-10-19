package pr4_1.task1;

public class Circle extends Shape{
    private double r;
    private Point point;

    public Circle(double r, Point point) {
        this.r = r;
        this.point = point;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getArea(){
        return 3.14*r*r;
    }
    public double getPerimeter(){
        return 2*3.14*r;
    }
    @Override
    public String getType(){
        return "Круг";
    }
    @Override
    public String toString() {
        return "r=" + String.format("%.3f", r) + " " + point;
    }
}
