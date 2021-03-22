package java8.operation.reduce;

import sun.applet.Main;

import java.util.Arrays;
import java.util.stream.Stream;

public class Maximum {



    public static void main(String[] args) {

        int[] numbers = new int[]{};
        Integer max = Stream.of(3, 5, 7, 1, 2, 8)
                .reduce(Integer::max)
                .get();

        System.out.println(max);


    }
}
