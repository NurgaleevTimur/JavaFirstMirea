package pr4_1.task1;
public class Rectangle extends Shape{
    private Point a;
    private Point b;
    private Point c;

    public Rectangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double getArea(){
        double ab = Math.sqrt(Math.pow(a.getX()-b.getX(), 2) + Math.pow(a.getY()-b.getY(), 2));
        double bc = Math.sqrt(Math.pow(b.getX()-c.getX(), 2) + Math.pow(b.getY()-c.getY(), 2));
        return ab*bc;
    }
    public double getPerimeter(){
        double ab = Math.sqrt(Math.pow(a.getX()-b.getX(), 2) + Math.pow(a.getY()-b.getY(), 2));
        double bc = Math.sqrt(Math.pow(b.getX()-c.getX(), 2) + Math.pow(b.getY()-c.getY(), 2));
        return (ab+bc)*2;
    }
    @Override
    public String getType(){
        return "Прямоугольник";
    }
}