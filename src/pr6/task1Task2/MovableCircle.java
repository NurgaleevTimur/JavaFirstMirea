package pr6.task1Task2;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    public void moveUp() {
        center.setY(center.getY()+center.getySpeed());
    }

    public void moveDown() {
        center.setY(center.getY()-center.getySpeed());
    }

    public void moveLeft() {
        center.setX(center.getX()-center.getxSpeed());
    }

    public void moveRight() {
        center.setX(center.getX()+center.getxSpeed());
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
