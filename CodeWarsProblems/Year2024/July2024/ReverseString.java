package July2024;
/*
Task
Given a string str, reverse it and omit all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".

Input/Output
[input] string str
A string consists of lowercase latin letters, digits and symbols.

[output] a string
 */

public class ReverseString {
    // Method to reverse the input string and omit non-alphabetic characters
    public static String reverseLetter(final String str) {
        // Create a StringBuilder to store the reversed string
        StringBuilder reversed = new StringBuilder();

        // Iterate through the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            // Retrieve the character at index i
            char c = str.charAt(i);

            // Check if the character is alphabetic
            if (Character.isLetter(c)) {
                // Append the alphabetic character to the reversed StringBuilder
                reversed.append(c);
            }
        }

        // Convert the StringBuilder to a String and return the reversed string
        return reversed.toString();
    }

    // Main method to run test cases
    public static void main(String[] args) {
        // Test case 1: Reverse the string "krishan" -> "nahsirk"
        String str1 = "krishan";
        System.out.println(reverseLetter(str1));

        // Test case 2: Reverse the string "ultr53o?n" -> "nortlu"
        String str2 = "ultr53o?n";
        System.out.println(reverseLetter(str2));
    }
}
/*
We have defined the main method, which serves as the entry point of the program. This is where we will write our test cases.
We declare a variable str1 and assign it the value "krishan". This will be our first test case.
We call the reverseLetter method, passing str1 as the argument. This will reverse the string and omit non-alphabetic characters.
We use System.out.println to display the result of the first test case. The expected output is "nahsirk".
We declare a variable str2 and assign it the value "ultr53o?n". This will be our second test case.
We call the reverseLetter method again, passing str2 as the argument.
We use System.out.println to display the result of the second test case. The expected output is "nortlu".
 */