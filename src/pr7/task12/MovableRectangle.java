package pr7.task12;

public class MovableRectangle implements Movable{
    private MovablePoint point;

    public MovableRectangle(MovablePoint point) {
        this.point = point;
    }

    @Override
    public void moveUp(int y) {
        point.moveUp(y);
    }

    @Override
    public void moveDown(int y) {
        point.moveDown(y);
    }

    @Override
    public void moveLeft(int x) {
        point.moveLeft(x);
    }

    @Override
    public void moveRight(int x) {
        point.moveRight(x);
    }

    public String toString(){

        return "Rectangle{" +
                "x =" + point.getX() +
                ", y =" + point.getY() +
                '}';
    }
}
