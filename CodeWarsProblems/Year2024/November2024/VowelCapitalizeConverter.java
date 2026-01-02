public class VowelCapitalizeConverter {
    
    // Method to swap vowels to uppercase in a given string
    public static String swap(String st) {
        // Create a StringBuilder to store the modified string
        StringBuilder result = new StringBuilder();
        
        // Loop through each character in the input string
        for (char ch : st.toCharArray()) {
            // Check if the character is a vowel
            if (isVowel(ch)) {
                // If it's a vowel, convert it to uppercase and append to the result
                result.append(Character.toUpperCase(ch));
            } else {
                // If it's not a vowel, simply append the character to the result
                result.append(ch);
            }
        }
        
        // Return the modified string
        return result.toString();
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        // Convert the character to uppercase for comparison
        ch = Character.toUpperCase(ch);
        // Check if the character is one of the vowels
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    // Main method to test the swap method
    public static void main(String[] args) {
        // Test cases
        String test1 = "Hello World!";
        System.out.println(swap(test1)); // Output: "HEllO WOrld!"

        String test2 = "Java is fun";
        System.out.println(swap(test2)); // Output: "JAvA Is fUn"
    }
}
