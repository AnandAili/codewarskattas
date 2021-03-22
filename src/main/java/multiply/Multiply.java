package multiply;

public class Multiply {
    public  static Double multiply(Double a, Double b) {
        if(a == null || b == null) {
            throw new ArithmeticException("Bad Inout");
        }
        return Double.valueOf(a.doubleValue() * b.doubleValue());
    }
}
