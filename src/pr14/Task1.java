package pr14;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите строку, которую нужно разбить");
        Scanner sc = new Scanner(System.in);
        String toParse = sc.next();
        System.out.println("Введите элемент строки, по которой нужно разбить строку '" + toParse+"'");
        String splitPhrase = sc.next();
        String[] st = toParse.split(splitPhrase);
//        StringTokenizer st = new StringTokenizer(toParse, splitPhrase);
        System.out.println("Компоненты строки '"+ toParse +"', разбтитые по строке '"+splitPhrase+"':");
        System.out.println(Arrays.toString(st));
//        while(st.hasMoreElements()){
//            System.out.print(st.nextToken());
//        }
    }
}