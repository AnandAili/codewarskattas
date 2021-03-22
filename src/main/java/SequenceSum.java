import java.util.stream.Stream;

public class SequenceSum {

    public static void main(String[] args) {

//        -38908464
//                -23398213
//                -27084163
        System.out.println(sequenceSum(-38908464
                ,-23398213,-27084163));

        System.out.println(sequenceSum(0
                ,5,-1));

    }

    public static long sequenceSum(int i, int j, int k) {

        int extra = ( j > 0 && k < 0)? 1:0;

        long totalSum = Stream.iterate(i, n -> n + 1)
                .limit(Math.abs(Math.abs(j) - Math.abs(i)))
                .map(Long::valueOf)
                .reduce((a, b) -> {
                    return a + (b);
                }).get();
        long sum2 = Stream.iterate(j, n -> n - 1)
                .limit(extra + (Math.abs(Math.abs(j) - Math.abs(k))))
                .map(Long::valueOf)
                .reduce((a, b) -> {
                    return a + (b);
                }).get();

        return totalSum + sum2 + k;
    }
}
