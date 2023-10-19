package pr6.task6789;

public class Shop implements Printable{
    private Printable[] books;

    public Shop(Printable[] books) {
        this.books = books;
    }
    public void print(){
        for (Printable p: books){
            p.print();
        }
    }
}