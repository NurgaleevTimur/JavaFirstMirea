package pr3.mathrandom.task2;

public class Circle {
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

    @Override
    public String toString() {
        return "r=" + String.format("%.3f", r) + " " + point;
    }
}
