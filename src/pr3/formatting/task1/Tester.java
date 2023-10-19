package pr3.formatting.task1;
import pr3.formatting.task2.CurrConv;

public class Tester {
    public static void main(String[] args) {
        pr3.formatting.task2.CurrConv r = new CurrConv();
        System.out.println("123.25 долларов в евро: "+ r.UsdToEuro(123.25));
        System.out.println("123.25 евро в долларах: "+ r.EuroToUsd(123.25));
        System.out.println("123.25 юаней в евро: "+ r.CnyToEuro(123.25));
        System.out.println("123.25 евро в юанях: "+ r.EuroToCny(123.25));
        System.out.println("123.25 долларов в юанях: "+ r.UsdToCny(123.25));
        System.out.println("123.25 юаней в долларах: "+ r.CnyToUsd(123.25));
    }
}