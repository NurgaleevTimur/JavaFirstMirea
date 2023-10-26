package pr13.task4;

public class Shirt {
    private String art;
    private String name;
    private String color;
    private String size;

    public Shirt(String art, String name, String color, String size) {
        this.art = art;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return  "art: " + art +
                ", name: " + name +
                ", color: " + color +
                ", size:" + size;
    }
}
