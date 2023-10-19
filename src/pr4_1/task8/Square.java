package pr4_1.task8;

public class Square extends Rectangle {
    public Square(){};
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.length;
    }
    public void setSide(double side){
        super.length = side;
        super.width = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
