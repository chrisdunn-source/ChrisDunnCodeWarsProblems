package August2024;
/*
Write function alternateCase which switch every letter in string from upper to lower and from lower to upper. E.g: Hello World -> hELLO wORLD
 */
public class AlternateCase {
    // Function to alternate the case of each letter in a string
    static String alternateCase(final String string) {
        // Convert the input string to an array of characters
        char[] chars = string.toCharArray();

        // Loop through each character in the array
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i]; // Get the current character

            // Check if the character is uppercase
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c); // Convert uppercase to lowercase
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c); // Convert lowercase to uppercase
            }
        }

        // Convert the modified character array back to a string and return it
        return new String(chars);
    }

    public static void main(String[] args) {
        String original = "Hello World";
        System.out.println(alternateCase(original)); // Output: hELLO wORLD
    }
}