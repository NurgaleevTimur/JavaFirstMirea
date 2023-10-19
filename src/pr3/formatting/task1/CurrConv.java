package pr3.formatting.task1;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrConv {
    public String EuroToUsd(double euro){
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.US);
        return numberFormat4.format(euro*1.07);
    }
    public String UsdToEuro(double usd){
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        return numberFormat4.format(usd/1.07);
    }
    public String UsdToCny(double usd){
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        return numberFormat4.format(usd*7.23);
    }
    public String CnyToUsd(double cny){
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.US);
        return numberFormat4.format(cny/7.23);
    }
    public String EuroToCny(double euro){
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        return numberFormat4.format(euro*7.71);
    }
    public String CnyToEuro(double cny){
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        return numberFormat4.format(cny/7.71);
    }
}
