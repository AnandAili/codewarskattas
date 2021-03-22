package codingame.reverse.thirdday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintOkOrAAAAAAA {

//    public static void main(String[] args) {
//        System.out.print((new Scanner(System.in)).nextDouble()%4==0?"AAAAAAAAAA!!!":"Ok");
//    }

//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int s = in.nextInt();
//        IntStream.range(0, s)
//                .forEach( (row) -> {
//                    IntStream.range(0, s)
//                            .forEach((col) -> {
//                                System.out.print("+");
//                            });
//                    System.out.println();
//                });
//    }

//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//
//        AtomicLong count = new AtomicLong();
//        IntStream.range(0, N-1)
//                .forEach(a -> {
//                    count.set(IntStream.range(0, N - 1)
//                            .filter(b -> Math.pow(a, 2) - Math.pow(b, 2) == N)
//                            .count());
//
//                });
//        System.out.println(( count.get() == 0)? "they don't":"they do");
//
//    }

    public static void main(String[] args) {
        String[] names = {"Maruti","Anand","Ball"};
        System.out.println(Arrays.stream(names).sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList()));

    }




}
