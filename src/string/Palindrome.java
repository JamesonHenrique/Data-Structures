package string;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        int  start= 0;
        int end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(
            String[] args) {
        String word = "esse";
        System.out.println("The word '" +word + " ' is a palindrome? " + isPalindrome( word));

    }
}
