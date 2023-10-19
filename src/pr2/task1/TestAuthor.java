package pr2.task1;
import java.util.Scanner;
/*
По диаграмме класса UML описывающей сущность Автор.
Необходимо написать программу, которая состоит из двух классов Author
и TestAuthor. Класс Author должен содержать реализацию методов,
представленных на диаграмме класса на рисунке 2.4.
 */
public class TestAuthor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя автора:");
        String name = sc.next();
        System.out.println("Введите email:");
        String email = sc.next();
        System.out.println("Введите гендер:");
        char gender = sc.next().charAt(0);
        Author test = new Author(name, email, gender);
        System.out.println(test);
    }
}