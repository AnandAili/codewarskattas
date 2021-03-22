package string;

public class CaptalizeFIrstCharacter {

    public static void main(String[] args) {
        String inout = "i am anand";
        StringBuilder result = new StringBuilder();
        for(String word: inout.split(" ")) {
            result.append(word.substring(0,1).toUpperCase() +  word.substring(1) + " ");
        }
        System.out.println(result.toString());
    }
}
