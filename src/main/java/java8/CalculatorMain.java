package java8;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println(OldCalculator.cube(2));
        System.out.println(OldCalculator.calculate( num -> {
            return num * num * num;
        }, 2));
    }
}

class OldCalculator {
    public static int cube(int x) {
        return x * x * x;
    }

    public static int calculate(Calulator behavir, Integer num) {
        return behavir.calculate(num);
    }
}


