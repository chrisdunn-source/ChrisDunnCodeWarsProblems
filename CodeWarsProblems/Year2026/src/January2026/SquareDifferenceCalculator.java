/*
Find the difference between the square of the sum of the first n natural numbers (1 <= n <= 100) and the sum of their squares.

Example
For example, when n = 10:

The square of the sum of the numbers is:

(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10)² = 55² = 3025
The sum of the squares of the numbers is:

1² + 2² + 3² + 4² + 5² + 6² + 7² + 8² + 9² + 10² = 385
Hence the difference between square of the sum of the first ten natural numbers and the sum of the squares of those numbers is: 3025 - 385 = 2640


*/
public class SquareDifferenceCalculator {
    
    // Method to calculate the difference between the square of the sum and the sum of squares for the first n natural numbers
    public static int differenceOfSquares(int n) {
        int sumOfNumbers = n * (n + 1) / 2;
        int squareOfSum = sumOfNumbers * sumOfNumbers;
        int sumOfSquares = n * (n + 1) * (2 * n + 1) / 6;
        
        return squareOfSum - sumOfSquares;
    }
    
    // Main method for program execution
    public static void main(String[] args) {
        int n = 10; // Choose the value of n here
        
        // Calculate the difference using the method
        int difference = differenceOfSquares(n);
        
        // Output the difference to the console
        System.out.println("The difference between the square of the sum and the sum of squares for the first " + n + " natural numbers is: " + difference);
    }
}
