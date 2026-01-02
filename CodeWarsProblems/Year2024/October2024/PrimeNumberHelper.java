import java.util.ArrayList;
import java.util.List;

// Let's name our class PrimeNumberHelper to reflect its purpose
public class PrimeNumberHelper {
    
    // Our main method to run some test cases
    public static void main(String[] args) {
        // Test cases
        int[] numbers1 = {3, 1, 2};
        System.out.println("Minimum number to insert: " + minimumNumber(numbers1)); // Expected output: 1
        
        int[] numbers2 = {5, 5, 5, 5};
        System.out.println("Minimum number to insert: " + minimumNumber(numbers2)); // Expected output: 3
    }
    
    // Method to find the minimum number to be inserted
    public static int minimumNumber(int[] numbers) {
        int sum = 0;
        
        // Calculate the sum of the input numbers
        for (int num : numbers) {
            sum += num;
        }
        
        // Find the closest prime number to the sum
        int target = findClosestPrime(sum);
        
        // Calculate and return the minimum number to be inserted
        return target - sum;
    }
    
    // Method to find the closest prime number
    private static int findClosestPrime(int num) {
        while (true) {
            if (isPrime(num)) {
                return num;
            }
            num++;
        }
    }
    
    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
