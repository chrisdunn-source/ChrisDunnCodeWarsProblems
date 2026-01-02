public class SequenceSum {
    // This method calculates and returns an arithmetic series based on the given pattern
    public static int[] sumOfN(int n) {
        // Create an array to store the arithmetic series
        int[] result = new int[Math.abs(n) + 1];
        int sum = 0; // Initialize the sum variable to 0
        
        // Loop through each term in the sequence
        for (int i = 0; i <= Math.abs(n); i++) {
            if (n >= 0) {
                // If n is positive, add the current term to the sum
                sum += i;
                result[i] = sum; // Store the sum at the current index
            } else {
                // If n is negative, subtract the current term from the sum
                sum -= i;
                result[i] = sum; // Store the sum at the current index
            }
        }
        
        return result; // Return the arithmetic series array
    }

    // Main method to test the sumOfN method
    public static void main(String[] args) {
        // Test cases
        int n1 = 5;
        int n2 = -5;
        int n3 = 7;
        
        // Calculate and print the arithmetic series for each test case
        System.out.println("Arithmetic Series for n = " + n1 + ": " + Arrays.toString(sumOfN(n1)));
        System.out.println("Arithmetic Series for n = " + n2 + ": " + Arrays.toString(sumOfN(n2)));
        System.out.println("Arithmetic Series for n = " + n3 + ": " + Arrays.toString(sumOfN(n3)));
    }
}
