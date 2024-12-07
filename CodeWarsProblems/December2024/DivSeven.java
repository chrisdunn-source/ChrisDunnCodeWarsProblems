// Problem: Given a number m, determine if it is divisible by 7 based on a specific rule.
// Rule: A number m of the form 10x + y is divisible by 7 if and only if x − 2y is divisible by 7.

class DivSeven {
    public static long[] seven(long m) {
        int steps = 0; // Variable to track the number of steps taken
        
        // Continue the process until m has at most 2 digits
        while (m > 99) {
            m = m / 10 - 2 * (m % 10); // Subtract twice the last digit from the number formed by the remaining digits
            steps++; // Increment the steps count
        }
        
        // Return an array containing the last number with at most 2 digits and the number of steps taken
        return new long[] { m, steps };
    }
    
    // Main method with test cases
    public static void main(String[] args) {
        // Test cases
        long num1 = 371;
        long num2 = 1603;
        long num3 = 372;
        long num4 = 477557101;
        
        // Call the seven method for each test case
        long[] result1 = seven(num1);
        long[] result2 = seven(num2);
        long[] result3 = seven(num3);
        long[] result4 = seven(num4);
        
        // Display the results
        System.out.println("Result 1: Last Number - " + result1[0] + ", Steps - " + result1[1]);
        System.out.println("Result 2: Last Number - " + result2[0] + ", Steps - " + result2[1]);
        System.out.println("Result 3: Last Number - " + result3[0] + ", Steps - " + result3[1]);
        System.out.println("Result 4: Last Number - " + result4[0] + ", Steps - " + result4[1]);
    }
}
