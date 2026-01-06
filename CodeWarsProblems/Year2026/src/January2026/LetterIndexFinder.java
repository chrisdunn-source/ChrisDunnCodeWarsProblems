import java.util.ArrayList;
/*
Write a function that takes a single non-empty string of only lowercase and uppercase ascii letters (word) as its argument, and returns an ordered list containing the indices of all capital (uppercase) letters in the string.

Example (Input --> Output)
"CodEWaRs" --> [0,3,4,6]
*/


public class LetterIndexFinder {
    // Method to find indices of capital letters in the string
    public static int[] capitals(String s) {
        ArrayList<Integer> indices = new ArrayList<>(); // List to store the indices of capital letters
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is uppercase
            if (Character.isUpperCase(s.charAt(i))) {
                indices.add(i); // Add the index to the list if it's a capital letter
            }
        }
        
        // Convert the list of indices to an array for the return value
        return indices.stream().mapToInt(Integer::intValue).toArray(); // Stream to convert to int array
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = capitals("CodEWaRs");
        System.out.println(java.util.Arrays.toString(result1)); // Expected output: [0, 3, 4, 6]

        int[] result2 = capitals("HelloWorld");
        System.out.println(java.util.Arrays.toString(result2)); // Expected output: [0, 5]

        int[] result3 = capitals("testcase");
        System.out.println(java.util.Arrays.toString(result3)); // Expected output: []

        int[] result4 = capitals("javaSCRIPT");
        System.out.println(java.util.Arrays.toString(result4)); // Expected output: [4, 5, 6, 7, 8]
    }
}
