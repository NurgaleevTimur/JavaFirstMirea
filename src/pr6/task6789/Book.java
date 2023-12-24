package pr6.task6789;

public class Book implements Printable{
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public void print(){
        System.out.println(author+" "+name);
    }
}
