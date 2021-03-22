package java8.java8inaction.chapter5;

import java8.java8inaction.chapter5.Dish;

import java.util.*;
import java.util.stream.IntStream;

public class DishApplication {

    static final List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH) );

    public static enum CaloricLevel { DIET, NORMAL, FAT};

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    private static boolean isPrime(Integer number) {
        return IntStream.rangeClosed(2, (int)Math.sqrt((double)number))
                .noneMatch( divider -> number % divider == 0);

    }

    private static boolean isPrime(List<Integer> list, Integer number) {
        return !(list.stream().noneMatch( i -> number % i ==0));

    }
}
