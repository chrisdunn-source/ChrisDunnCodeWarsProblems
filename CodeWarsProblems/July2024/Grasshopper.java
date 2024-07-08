package July2024;
/*
Summation
Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0. Your function only needs to return the result, what is shown between parentheses in the example below is how you reach that result and it's not part of it, see the sample tests.

For example (Input -> Output):

2 -> 3 (1 + 2)
8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
 */

public class Grasshopper {
    // Method to calculate the summation of numbers from 1 to n
    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Main method to run the program and test the summation method
    public static void main(String[] args) {
        // Test cases
        int num1 = 2;
        int result1 = summation(num1);
        System.out.println("Summation of numbers from 1 to " + num1 + ": " + result1);

        int num2 = 8;
        int result2 = summation(num2);
        System.out.println("Summation of numbers from 1 to " + num2 + ": " + result2);
    }
}
