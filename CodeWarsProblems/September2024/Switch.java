/*
Given a string made up of letters a, b, and/or c, switch the position of letters a and b (change a to b and vice versa). Leave any incidence of c untouched.

Example:

'acb' --> 'bca'
'aabacbaa' --> 'bbabcabb'
 */
public class Switch {
    // Method to switch 'a' to 'b' and 'b' to 'a' in the given string
    public static String switcheroo(String x) {
        // Create a StringBuilder to construct the result string efficiently
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input string
        for (char ch : x.toCharArray()) {
            // Check if the current character is 'a'
            if (ch == 'a') {
                // If it is 'a', append 'b' to the result
                result.append('b');
            }
            // Check if the current character is 'b'
            else if (ch == 'b') {
                // If it is 'b', append 'a' to the result
                result.append('a');
            }
            // If the character is neither 'a' nor 'b'
            else {
                // Append the character unchanged (this handles 'c' or any other character)
                result.append(ch);
            }
        }

        // Convert the StringBuilder to a String and return the result
        return result.toString();
    }

    // Main method to test the switcheroo function
    public static void main(String[] args) {
        // Test case 1: Expected output is "bca"
        System.out.println(switcheroo("acb"));

        // Test case 2: Expected output is "bbabcabb"
        System.out.println(switcheroo("aabacbaa"));
    }
}