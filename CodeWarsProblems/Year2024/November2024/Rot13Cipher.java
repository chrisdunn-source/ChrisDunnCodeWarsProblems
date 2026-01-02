public class Rot13Cipher {
    // Function to apply ROT13 cipher to a given string
    public static String rot13(String str) {
        StringBuilder result = new StringBuilder();

        // Iterate over each character in the input string
        for (char c : str.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Determine the base character based on case (uppercase or lowercase)
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                // Apply ROT13 transformation to the letter
                result.append((char) (((c - base + 13) % 26) + base));
            } else {
                // If the character is not a letter, leave it unchanged
                result.append(c);
            }
        }

        // Return the ROT13 ciphered string
        return result.toString();
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test the ROT13 function with some sample inputs
        System.out.println(rot13("Hello, World!")); // Output should be "Uryyb, Jbeyq!"
        System.out.println(rot13("Java is fun!")); // Output should be "Wnin vf sha!"
    }
}
