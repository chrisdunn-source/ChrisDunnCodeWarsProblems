class StringManipulator {
    // Method to capitalize letters at even and odd indexes separately
    public static String[] capitalize(String s) {
        // Convert the input string to a character array for easier manipulation
        char[] chars = s.toCharArray();
        
        // StringBuilder to store characters at even indexes
        StringBuilder evenIndexes = new StringBuilder();
        // StringBuilder to store characters at odd indexes
        StringBuilder oddIndexes = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < chars.length; i++) {
            // Check if the index is even
            if (i % 2 == 0) {
                // Append the character in uppercase to evenIndexes and in original form to oddIndexes
                evenIndexes.append(Character.toUpperCase(chars[i]));
                oddIndexes.append(chars[i]);
            } else {
                // Append the character in original form to evenIndexes and in uppercase to oddIndexes
                evenIndexes.append(chars[i]);
                oddIndexes.append(Character.toUpperCase(chars[i]));
            }
        }

        // Return an array containing the capitalized strings for even and odd indexes
        return new String[] { evenIndexes.toString(), oddIndexes.toString() };
    }

    public static void main(String[] args) {
        // Test the capitalize method with an example input
        String input = "abcdef";
        String[] result = capitalize(input);
        System.out.println("Capitalize Even Indexes: " + result[0]);
        System.out.println("Capitalize Odd Indexes: " + result[1]);
    }
}
