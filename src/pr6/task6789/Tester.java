package pr6.task6789;

public class Tester {
    public static void main(String[] args) {
        Printable[] s ={
                new Book("Evgeniy Onegin", "A.S. Pushkin"),
                new Book("1984", "George Orwell")};
        Printable shop = new Shop(s);
        shop.print();
    }
}
