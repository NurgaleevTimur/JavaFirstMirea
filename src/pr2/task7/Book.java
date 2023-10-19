package pr2.task7;
/*
Создать класс, описывающий книгу (Book). В классе должны быть
описаны нужные свойства книги (автор, название, год написания и т. д.) и
методы для получения, изменения этих свойств. Протестировать работу класса в классе BookTest,
содержащим метод статический main(String[] args). Создать класс книжная полка, в котором поля
данных класса это массив объектов типа книги (Book, и количество книг на книжной полке.
Написать методы класса, которые возвращают книги с самым поздним и самым ранним сроком издания.
Написать метод класса, позволяющий расставить книги на книжной полке в порядке возрастания года выпуска.
Используйте реализацию отношений
 */
public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Автор: " + author + ", название: " + name +
                ", год издания: " + year;
    }
}