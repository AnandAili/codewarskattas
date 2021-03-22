package sumofpositivenumbers;

import java.util.Arrays;

public class SumOfPositiveNumbers {

    public int sum(int[] numberList) {
//        int sum = 0;
//
//        for(int currentNumner: numberList) {
//            // find positive number
//            if(currentNumner >= 0) {
//                sum = sum + currentNumner;
//            }
//        }
//        return sum;
        return Arrays.stream(numberList).filter( num -> num >=0).sum();
    }
}
