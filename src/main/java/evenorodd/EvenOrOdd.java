package evenorodd;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        System.out.println("Number:" + number);
        String[] evenOrOdd = {"Even","Odd"};
        return evenOrOdd[Math.abs(number) % 2];
    }
}
