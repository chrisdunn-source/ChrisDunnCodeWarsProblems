public class TwoToOne {
  /*
Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, 
containing distinct letters - each taken only once - coming from s1 or s2.

Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
  */
    
    public static String longest(String s1, String s2) {
        String combined = s1 + s2; // Combine the input strings
        char[] chars = combined.toCharArray(); // Convert to character array
        Arrays.sort(chars); // Sort the array
        
        StringBuilder sb = new StringBuilder();
        char prevChar = '\0'; // Store the previous character
        for (char c : chars) {
            if (c != prevChar) {
                sb.append(c); // Append distinct characters
                prevChar = c;
            }
        }
        
        return sb.toString(); // Convert StringBuilder back to string
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(longest(s1, s2)); // Output: dehlorw
    }
}
