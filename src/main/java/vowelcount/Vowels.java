package vowelcount;

import java.util.Arrays;

public class Vowels {

    public static int getCount(String str) {
        // your code here
        System.out.println(str);
        return (int)Arrays.stream(str.split(""))
                .filter(
                        character ->  "aeiou".contains(character)
                )
                .count();
    }

}
