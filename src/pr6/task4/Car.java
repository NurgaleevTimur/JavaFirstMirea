package pr6.task4;

public class Car implements Priceable{
    private int price;

    public Car(int price) {
        this.price = price;
    }
    public void getPrice(){
        System.out.println(price);
    }
}
