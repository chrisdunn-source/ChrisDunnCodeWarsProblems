public class Calculator {
    // Define a class named Calculator to contain our calculate function

    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        // Create a function named calculate that takes two numbers and an operation as input

        Double result = null;
        // Declare a variable named result to store the calculated result, initially set to null

        switch(operation) {
            // Start a switch statement based on the operation input
            case "+":
                // If the operation is addition
                result = numberOne + numberTwo;
                // Calculate the sum of the two numbers and assign it to the result
                break;
            case "-":
                // If the operation is subtraction
                result = numberOne - numberTwo;
                // Calculate the difference of the two numbers and assign it to the result
                break;
            case "*":
                // If the operation is multiplication
                if(numberOne == 0 || numberTwo == 0) {
                    // Check if either number is zero
                    result = 0.0;
                    // If so, assign 0.0 to the result to handle multiplication by zero
                } else {
                    result = numberOne * numberTwo;
                    // Otherwise, calculate the product of the two numbers and assign it to the result
                }
                break;
            case "/":
                // If the operation is division
                if(numberTwo != 0) {
                    // Check if the divisor is not zero to avoid division by zero error
                    result = numberOne / numberTwo;
                    // Calculate the quotient of the two numbers and assign it to the result
                }
                break;
            default:
                // If the operation is not recognized
                break;
        }

        return result;
        // Return the calculated result or null if the operation is invalid or involves division by zero
    }

    public static void main(String[] args) {
        // Define the main method to test the calculate function

        // Perform calculations and print the results for different test cases
        System.out.println(calculate(2, "+", 4)); // Should return 6
        System.out.println(calculate(6, "-", 1.5)); // Should return 4.5
        System.out.println(calculate(-4, "*", 8)); // Should return -32
        System.out.println(calculate(49, "/", -7)); // Should return -7
        System.out.println(calculate(8, "m", 2)); // Should return null
        System.out.println(calculate(4, "/", 0)); // Should return null
    }
}
