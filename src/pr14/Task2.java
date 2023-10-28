package pr14;
import java.util.regex.*;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите строку, которую нужно проверить на соответствие");
        Scanner sc = new Scanner(System.in);
        String checkString = sc.next();
        Pattern match = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher st = match.matcher(checkString);
        boolean matches = st.matches();
        if (matches)
            System.out.println("Введенная строка совпадает со строкой " + "'abcdefghijklmnopqrstuv18340'");
        else
            System.out.println("Введенная строка не совпадает со строкой " + "'abcdefghijklmnopqrstuv18340'");
    }
}