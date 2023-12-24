package pr18_24.pr20.task4;

public class Calculator {

    public Calculator() {
    }

    static <E extends Number> Number sum(E x, E y) {
        return x.doubleValue() + y.doubleValue();
    }

    static <E extends Number> Number multiply(E x, E y) {
        return x.doubleValue() * y.doubleValue();
    }

    static <E extends Number> Number divide(E x, E y) {
        return x.doubleValue() / y.doubleValue();
    }

    static <E extends Number> Number substraction(E x, E y) {
        return x.doubleValue() - y.doubleValue();
    }
}
