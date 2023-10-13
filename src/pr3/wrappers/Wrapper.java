package pr3.wrappers;

public class Wrapper {
    public static void main(String[] args) {
        Double d = 6.5;
        String str = "55";
        System.out.println(d);
        System.out.println("Value = " + d.valueOf(str));
        System.out.println(Double.parseDouble("234.345"));
        System.out.println((int) 480.038);
        System.out.println((char) 480.038);
        System.out.println(Double.toString(3.14));
    }
}
