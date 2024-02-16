package February2024;

public class SumArray {

    /**
     * Calculates the sum of numbers in an array.
     *
     * @param numbers The array of numbers.
     * @return The sum of the numbers.
     */
    /*
    Write a java method that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.

    Examples
    Input: [1, 5.2, 4, 0, -1]
    Output: 9.2

    Input: []
    Output: 0

    Input: [-2.398]
    Output: -2.398

    Assumptions
    You can assume that you are only given numbers.
    You cannot assume the size of the array.
    You can assume that you do get an array and if the array is empty, return 0.
    Tests expect accuracy of 1e-4.
     */
    public static double sum(double[] numbers) {
        double sum = 0.0; // Initialize the sum variable to 0
        for (double number : numbers) { // Iterate over each number in the array
            sum += number; // Add the current number to the sum
        }
        return sum; // Return the calculated sum
    }

    public static void main(String[] args) {
        // Example inputs
        double[] numbers1 = {1, 5.2, 4, 0, -1}; // contains multiple numbers
        double[] numbers2 = {}; // empty array
        double[] numbers3 = {-2.398}; // contains a single number

        // Calculate and print the sum of numbers for each example
        System.out.println(sum(numbers1)); // Output: 9.2
        System.out.println(sum(numbers2)); // Output: 0.0
        System.out.println(sum(numbers3)); // Output: -2.398
    }
}
/*
    The sum method is responsible for calculating the sum of numbers in an array. It takes an array of numbers as input (double[] numbers) and returns the sum as a double value. The method is marked with a Javadoc comment to describe its purpose, parameters, and return value.

    Inside the sum method, a variable named sum is initialized to 0. This variable will be used to accumulate the sum of the numbers.

    The method uses a for-each loop to iterate over each number in the numbers array. In each iteration, the current number is added to the sum variable using the += operator.

    After iterating over all the numbers in the array, the method returns the calculated sum.

    In the main method, three examples are provided to demonstrate the usage of the sum method.

    Example numbers1 is an array with multiple numbers. The sum method is called with numbers1 as an argument, and the returned sum is printed to the console.

    Example numbers2 is an empty array. The sum method is called with numbers2, and since there are no numbers in the array, the sum returned will be 0.0.

    Example numbers3 is an array with a single number. The sum method is called with numbers3, and the sum returned will be the single number itself, which is -2.398.
 */