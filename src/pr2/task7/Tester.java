package pr2.task7;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Bookshelf sh1 = new Bookshelf(new Book[5], 5);
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<sh1.getAmo(); i++){
            System.out.println("Введите автора книги:");
            String author = sc.next();
            System.out.println("Введите название книги:");
            String name = sc.next();
            System.out.println("Введите год издания книги:");
            int year = sc.nextInt();
            sh1.setBook(new Book(author, name, year), i);
        }
        for (int i=0; i<sh1.getShelf().length; i++){
            System.out.format("%s\n", sh1.getShelf()[i]);
        }
        System.out.println("___________________________________________");
        System.out.println("Книга с самым ранним годом издания: " + sh1.minyear());
        System.out.println("Книга с самым поздним годом издания: " + sh1.maxyear());
        System.out.println("___________________________________________");
        sh1.sortShelf();
        System.out.println("Отсортированная по датам издания книжная полка:");
        for (int i=0; i<sh1.getShelf().length; i++){
            System.out.format("%s\n", sh1.getShelf()[i]);
        }
    }


}
