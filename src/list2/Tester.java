package list2;
public class Tester {
    public static void main(String[] args) {
        Cont c = new Cont();
        c.insert("aa");
        c.insert("cb");
        c.insert("bc");
        c.insert("ca");
        c.insert("ad");
        c.insert("dc");
        c.insert("db");
        System.out.println(c);
        c.sort4();
        System.out.println(c);

    }
}
