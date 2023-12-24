package pr11;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите год");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("Введите месяц");
        int month = sc.nextInt();
        System.out.println("Введите день");
        int day = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, day);
        Date userdate = new Date(c.get(Calendar.YEAR)-1900, c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        Date date = new Date();
        System.out.println(date);
        System.out.println(userdate);
        if (userdate.before(date)){
            System.out.println("Дата, введенная вами, раньше сегодняшнего дня");
        }
        else if (userdate.after(date)){
            System.out.println("Дата, введенная вами, позже сегодняшнего дня");
        }
        else {
            System.out.println("Дата, введенная вами, совпадает с сегодняшним днем");
        }
    }
}
