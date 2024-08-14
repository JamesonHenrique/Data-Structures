package stack;


import java.util.Stack;

public class StringReverse {

    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            stack.push(c);
        }

        for (int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "Jameson";
        System.out.println("Original String: " + str);
        System.out.println("Reverse: " + reverse(str));
    }
}
