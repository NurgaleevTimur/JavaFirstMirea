package pr13.task5;
import java.util.Scanner;

public class PhoneNumberConverter {
    private String phoneNumber;

    public PhoneNumberConverter(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String convert() {
        String formattedNumber;

        if (phoneNumber.startsWith("+") && phoneNumber.length() == 12) {
            formattedNumber = "+" + phoneNumber.substring(1, 2) + "-" + phoneNumber.substring(2, 5) + "-" + phoneNumber.substring(5, 8) + "-" + phoneNumber.substring(8);
        } else if (phoneNumber.startsWith("8") && phoneNumber.length() == 11) {
            formattedNumber = "+7" + "-" + phoneNumber.substring(1, 4) + "-" + phoneNumber.substring(4, 7) + "-" + phoneNumber.substring(7);
        } else {
            // Обработка некорректного формата номера
            formattedNumber = "Некорректный формат номера";
        }

        return formattedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста, введите номер телефона: ");
        String inputNumber = scanner.nextLine();

        PhoneNumberConverter converter = new PhoneNumberConverter(inputNumber);
        String formattedNumber = converter.convert();

        System.out.println("Преобразованный номер телефона: " + formattedNumber);
    }
}