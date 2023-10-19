package pr6.task1Task2;

public class Tester {
    public static void main(String[] args) {
        Movable mc = new MovableCircle(1, 2, 3, 4, 5);
        System.out.println(mc);
        mc.moveDown();
        System.out.println(mc);
        mc.moveLeft();
        System.out.println(mc);
    }
}
