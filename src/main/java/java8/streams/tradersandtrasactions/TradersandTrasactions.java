package java8.streams.tradersandtrasactions;

import com.sun.tools.internal.xjc.util.ErrorReceiverFilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TradersandTrasactions {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // Solution
        System.out.println("// Solution 1");
        List<Transaction> _2011transactions = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println(_2011transactions);

        // Solutions 2: what are all the unique cities where the trades work
        System.out.println("// Solutions 2: what are all the unique cities where the trades work");
        List<String> _cities = transactions.stream()
                .map( transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(_cities);

        // solution 3: find all traders from cambridge and sort them bynmae
        System.out.println("// solution 3: find all traders from cambridge and sort them bynmae");
        List<Trader> _cambridgeTraders = transactions.stream()
                .filter( transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());


        System.out.println(_cambridgeTraders);

        //Solution 4: Return a string of all traders’ names sorted alphabetically
        System.out.println("//Solution 4: Return a string of all traders’ names sorted alphabetically");
        String _tradersnames = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(Collectors.joining(" "));

        System.out.println(_tradersnames);

        // solution 5:  Are any traders based in Milan
        System.out.println("// solution 5:  Are any traders based in Milan");
        boolean isMilanTraders = transactions.stream()
                .anyMatch( transaction -> transaction.getTrader().getCity().equals("Milan"));

        System.out.println(isMilanTraders);

        // Solution 6: Print all transactions’ values from the traders living in Cambridge.
        System.out.println("// Solution 6: Print all transactions’ values from the traders living in Cambridge.");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);


        // solution 7: What’s the highest value of all the transactions
        System.out.println("// solution 7: What’s the highest value of all the transactions");
        Optional<Integer> _highestTrasaction = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

        _highestTrasaction.ifPresent(System.out::println);

        // solution 8: Find the transaction with the smallest value
        System.out.println("// solution 8: Find the transaction with the smallest value");
        Optional<Integer> _smallestTransaction = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        _smallestTransaction.ifPresent(System.out::println);


    }
}
