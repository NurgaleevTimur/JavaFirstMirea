package pr6.task3;

public class Car implements Nameable{
    private String name;

    public Car(String name) {
        this.name = name;
    }
    public void getName(){
        System.out.println(name);
    }
}