package July2024;
/*
Given a string s, write a method (function) that will return true if its a valid single integer or floating number or false if its not.

Valid examples, should return true:

isDigit("3")
isDigit("  3  ")
isDigit("-3.23")
should return false:

isDigit("3-4")
isDigit("  3   5")
isDigit("3 5")
isDigit("zero")
 */
public class MyUtilities {

    public static void main(String[] args) {
        // Test cases
        System.out.println(isDigit("3"));        // true
        System.out.println(isDigit("  3  "));    // true
        System.out.println(isDigit("-3.23"));    // true
        System.out.println(isDigit("3-4"));      // false
        System.out.println(isDigit("  3   5"));  // false
        System.out.println(isDigit("3 5"));      // false
        System.out.println(isDigit("zero"));     // false
    }

    public static boolean isDigit(String s) {
        // Trim leading and trailing whitespace
        s = s.trim();

        // Define the pattern for a valid single integer or floating number
        String pattern = "^[-+]?\\d*\\.?\\d+$";

        // Check if the string matches the pattern
        return s.matches(pattern);
    }
}
/*
isDigit("3") - This test case represents a valid single integer and should return true.
isDigit("  3  ") - Here, we have leading and trailing whitespace, which should be trimmed. The resulting string is still a valid single integer, so the method should return true.
isDigit("-3.23") - This test case represents a valid floating number with a negative sign. It should return true.
isDigit("3-4") - The input string contains an invalid format with a hyphen in the middle. It should return false.
isDigit("  3   5") - Similar to the previous test case, this string has invalid whitespace in the middle. It should return false.
isDigit("3 5") - Here, the input string contains a space between digits, which is invalid. It should return false.
isDigit("zero") - Finally, this test case does not represent a valid number and should return false.
 */