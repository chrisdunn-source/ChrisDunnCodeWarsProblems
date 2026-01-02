package April2024;

    /*
    Complete the solution so that it reverses the string passed into it.

    'world'  =>  'dlrow'
    'word'   =>  'drow'
     */

public class ReversedStrings {
    public static void main(String[] args) {
        String reversed = solution("world"); // Call the solution method with the input "world"
        System.out.println(reversed); // Print the reversed string
    }
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str); // Create a StringBuilder object and initialize it with the input string
        return sb.reverse().toString(); // Reverse the characters in the StringBuilder and convert it back to a string
    }
}
