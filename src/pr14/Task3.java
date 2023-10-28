package pr14;
import java.util.Scanner;
import java.util.regex.*;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите строку с ценой в USD, RUB или EU:");
        Scanner sc = new Scanner(System.in);
        String numbers = sc.next();
        String currency = sc.next();
        Pattern numCents = Pattern.compile("(\\d+).(\\d{0,2})");
        Pattern num = Pattern.compile("\\d+");
        Pattern usd = Pattern.compile("USD");
        Pattern rub = Pattern.compile("RUB");
        Pattern eu = Pattern.compile("EU");
        Matcher numCentsMatch = numCents.matcher(numbers);
        Matcher numMatch = num.matcher(numbers);
        Matcher usdMatch = usd.matcher(currency);
        Matcher rubMatch = rub.matcher(currency);
        Matcher euMatch = eu.matcher(currency);
        boolean numOk = numMatch.matches() || numCentsMatch.matches();
        boolean curOk = usdMatch.matches() ||  rubMatch.matches() ||  euMatch.matches();
        if (numOk&&curOk)
            System.out.println("Цена введена правильно");
        else if (numOk==false&&curOk)
            System.out.println("Число введено неправильно");
        else if (numOk&&curOk==false)
            System.out.println("Валюта введена неправильно");
        else
            System.out.println("И число, и валюта введены неправильно");
    }
}