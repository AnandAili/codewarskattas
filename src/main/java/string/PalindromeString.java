package string;

public class PalindromeString {

    public static void main(String[] args) {
        String input = "dnand";

        // TODO: create two pointers. first pointer points to first char and other one points to last

        // TODO: compare chars at points, untill dismatch happens

        int startIndex = 0;
        int endIndex = input.length() - 1;

        for (; startIndex < input.length() / 2; startIndex++, endIndex--) {
            if(input.charAt(startIndex) != input.charAt(endIndex)) {
                System.out.println("Given inout is not Palindrome");
                break;
            }
        }

        System.out.println("Given inout is Palindrome");
    }
}
