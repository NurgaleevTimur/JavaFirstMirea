package pr14;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (checkPassword(password)) {
            System.out.println("Пароль надежный!");
        }
        else {
            System.out.println("Пароль недостаточно надежный!");
        }
    }

    public static boolean checkPassword(String password) {
        // Проверка длины пароля
        if (password.length() < 8) {
            return false;
        }

        // Проверка наличия заглавной буквы, маленькой буквы и цифры
        if (!Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).+").matcher(password).matches()) {
            return false;
        }

        // Проверка на допустимые символы (цифры, английские буквы и знак подчеркивания)
        if (!Pattern.compile("[A-Za-z0-9_]+").matcher(password).matches()) {
            return false;
        }

        return true;
    }
}