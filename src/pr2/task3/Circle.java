package pr2.task3;

public class Circle {
    private Point point;
    private double r;

    public Circle(Point point, double r) {
        this.point = point;
        this.r = r;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Центр окружности:" +
                point + ", радиус:" + r;
    }
}
