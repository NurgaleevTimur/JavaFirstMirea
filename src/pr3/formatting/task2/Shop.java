package pr3.formatting.task2;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cart=0;
        CurrConv c = new CurrConv();
        System.out.println("Выберите валюту (Euro, USD или CNY)");
        String x=sc.next();
        System.out.println("Ассортимент магазина:");
        System.out.println("1) Iphone 15 128GB");
        System.out.println("2) Iphone 15 256GB");
        System.out.println("3) Iphone 15 512GB");
        System.out.println("4) Iphone 15 Plus 128GB");
        System.out.println("5) Iphone 15 Plus 256GB");
        System.out.println("6) Iphone 15 Plus 512GB");
        System.out.println("7) Iphone 15 Pro 128GB");
        System.out.println("8) Iphone 15 Pro 256GB");
        System.out.println("10) Iphone 15 Pro 1TB");
        System.out.println("9) Iphone 15 Pro 512GB");
        System.out.println("11) Iphone 15 Pro Max 256GB");
        System.out.println("12) Iphone 15 Pro Max 512GB");
        System.out.println("13) Iphone 15 Pro Max 1TB");
        int y = 1;
        do{
            System.out.println("\nЕсли хотите выйти из программы, введите 0");
            System.out.println("Иначе введите номер товара, чтобы добавить его в корзину:");
            y = sc.nextInt();
            if (y==1){
                cart+=799;
            } else if (y==2 || y==4) {
                cart += 899;
            } else if (y == 3 || y==8) {
                cart +=1099;
            } else if (y==5 || y==7) {
                cart+=999;
            } else if (y==6 || y==11) {
                cart += 1199;
            } else if (y==9) {
                cart += 1299;
            } else if (y==12) {
                cart += 1399;
            } else if (y==10) {
                cart += 1499;
            }else if (y==13) {
                cart += 1599;
            }
            switch (x) {
                case "Euro":
                    System.out.printf("Стоимость вашей корзины: "+ c.UsdToEuro(cart));
                    break;
                case "USD":
                    System.out.printf("Стоимость вашей корзины: " +
                            NumberFormat.getCurrencyInstance(Locale.US).format(cart));
                    break;
                case "CNY":
                    System.out.printf("Стоимость вашей корзины: "+ c.UsdToCny(cart));
                    break;
            }
        } while (y!=0);
    }
}