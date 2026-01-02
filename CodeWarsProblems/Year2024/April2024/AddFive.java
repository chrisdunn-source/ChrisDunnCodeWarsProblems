package April2024;
 /*
 I created this function to add five to any number that was passed in to it and return the new value. It doesn't throw any errors but it returns the wrong number.
  */
public class AddFive {
    // Main method to test the addFive function
    public static void main(String[] args) {
        // Test case 1: Pass in 10
        int result1 = addFive(10);
        System.out.println("Result 1: " + result1); // Expected output: 15

        // Test case 2: Pass in -3
        int result2 = addFive(-3);
        System.out.println("Result 2: " + result2); // Expected output: 2

        // Test case 3: Pass in 0
        int result3 = addFive(0);
        System.out.println("Result 3: " + result3); // Expected output: 5
    }
    // Function to add five to the given number
    public static int addFive(int num) {
        // Calculate the sum of num and 5
        int total = num + 5;
        // Return the calculated sum
        return total;
    }
}
