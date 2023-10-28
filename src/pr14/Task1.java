package pr14;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите строку, которую нужно разбить");
        Scanner sc = new Scanner(System.in);
        String toParse = sc.next();
        System.out.println("Введите элемент строки, по которой нужно разбить строку '" + toParse+"'");
        String splitPhrase = sc.next();
        StringTokenizer st = new StringTokenizer(toParse, splitPhrase);
        System.out.println("Компоненты строки '"+toParse+"', разбтитые по строке '"+splitPhrase+"':");
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
}