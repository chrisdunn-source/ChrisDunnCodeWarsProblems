public class CountDig {
    
    // Method to count the occurrences of digit d in the squares of numbers from 0 to n
    public static int nbDig(int n, int d) {
        int count = 0; // Initialize a count variable to keep track of the occurrences
        
        for (int k = 0; k <= n; k++) {
            int square = k * k; // Calculate the square of the current number k
            String squareStr = String.valueOf(square); // Convert the square to a string
            
            // Iterate over each digit in the square's string representation
            for (int i = 0; i < squareStr.length(); i++) {
                // Check if the digit at position i is equal to the target digit d
                if (squareStr.charAt(i) - '0' == d) {
                    count++; // Increment the count if the digit matches
                }
            }
        }
        
        return count; // Return the total count of digit d in the squares
    }
    
    // Main method to test the nbDig function
    public static void main(String[] args) {
        // Test cases
        System.out.println(nbDig(10, 1)); // Expected output: 4
        System.out.println(nbDig(25, 1)); // Expected output: 11
    }
}
