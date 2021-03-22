package string;

public class ReversString {

    public static void main(String[] args) {
        String input = "I am anand"; // I ma dnana

        // TODO: spit each word by space " "

        // TODO: process each word

        // TODO: reverse it using String Builder and add it to main String builder

        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for(String word: words) {
            StringBuilder builder = new StringBuilder(word + " ");
            reversedString.append(builder.reverse());
        }
        System.out.println(reversedString.toString());
    }
}
