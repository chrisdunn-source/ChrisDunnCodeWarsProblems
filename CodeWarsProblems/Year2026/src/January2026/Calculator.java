/*
You are required to create a simple calculator that returns the result of addition, subtraction, multiplication or division of two numbers.

Your function will accept three arguments:
The first and second argument should be numbers.
The third argument should represent a sign indicating the operation to perform on these two numbers.

You should return the result of applying the given operation to these numbers.

Note: In dynamically typed languages (JS, PHP, Python), the first and second arguments can be not numbers. In that case, return "unknown value".

If the given operation to perform on the two numbers is not one of the four mentioned above, you should:

return a value:
"unknown value" (JS, PHP, Python)
throw an exception:
std::invalid_argument (C++)
ArgumentException (C#)
IllegalArgumentException (Java)
Example:
arguments: 1, 2, "+"
should return 3

arguments: 1, 2, "&"
refer to the description for what you should return in this case

# Specifically for dynamically-typed languages:

arguments: 1, "k", "*"
should return "unknown value"
*/
public class Calculator {
    
    // Method to calculate based on two numbers and an operation
    public static double calculate(double a, double b, String op) {
        // Check if the operation is valid using a switch statement
        switch (op) {
            case "+": // Case for addition
                return a + b; // Return the sum of a and b
            case "-": // Case for subtraction
                return a - b; // Return the difference of a and b
            case "*": // Case for multiplication
                return a * b; // Return the product of a and b
            case "/": // Case for division
                // Check for division by zero
                if (b == 0) {
                    // Throw an exception if dividing by zero
                    throw new IllegalArgumentException("Division by zero");
                }
                return a / b; // Return the quotient of a and b
            default: // Case for an unrecognized operation
                // Throw an exception for unknown operations
                throw new IllegalArgumentException("unknown value");
        }
    }

    // Main method to provide example usages of the calculate method
    public static void main(String[] args) {
        // Example usage for addition; should return 3
        System.out.println(calculate(1, 2, "+"));
        
        // Example usage for subtraction; should return 2
        System.out.println(calculate(4, 2, "-"));
        
        // Example usage for multiplication; should return 15
        System.out.println(calculate(3, 5, "*"));
        
        // Example usage for division; should return 5
        System.out.println(calculate(10, 2, "/"));
        
        // Uncommenting the line below will throw an exception for invalid operation
        // System.out.println(calculate(1, 2, "&")); // Should  throw an exception
    }
}
