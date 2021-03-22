package java8.exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCustomers {

    String filter(List<String> customers, MyLamda<String> lamda) {
        return null;
    }

    public static void main(String[] args) {
        FilterCustomers filterCustomers = new FilterCustomers();
        String[] s = {};
        Arrays.stream(s).collect(Collectors.toList());

        filterCustomers.filter(Arrays.stream(s).collect(Collectors.toList()), (ss) -> ss);
    }
}
