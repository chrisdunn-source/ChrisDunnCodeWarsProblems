package June2024;
/*
Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.

a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.

The four operators are "add", "subtract", "divide", "multiply".

A few examples:(Input1, Input2, Input3 --> Output)

5, 2, "add"      --> 7
5, 2, "subtract" --> 3
5, 2, "multiply" --> 10
5, 2, "divide"   --> 2.5
 */
class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        int result = 0; // initialize the result variable

        switch (operator) {
            case "add":
                result = a + b; // perform addition
                break;
            case "subtract":
                result = a - b; // perform subtraction
                break;
            case "multiply":
                result = a * b; // perform multiplication
                break;
            case "divide":
                result = a / b; // perform division
                break;
            default:
                System.out.println("Invalid operator"); // handle invalid operator
                break;
        }

        return result; // return the result
    }

    public static void main(String[] args) {
        // Test cases
        int result1 = arithmetic(5, 2, "add");
        System.out.println("Result 1: " + result1); // Expected output: 7

        int result2 = arithmetic(10, 3, "subtract");
        System.out.println("Result 2: " + result2); // Expected output: 7

        int result3 = arithmetic(4, 5, "multiply");
        System.out.println("Result 3: " + result3); // Expected output: 20

        int result4 = arithmetic(15, 3, "divide");
        System.out.println("Result 4: " + result4); // Expected output: 5

        int result5 = arithmetic(10, 2, "modulo");
        // Expected output: Invalid operator (since "modulo" is not a valid operator)
    }
}
/*
The arithmetic method takes in two integer inputs (a and b) and a string input (operator) representing the arithmetic operation to be performed.
Inside the method, we declare and initialize a variable result to hold the calculated result.
We use a switch statement to check the value of the operator string.
If the value matches one of the cases ("add", "subtract", "multiply", "divide"), the corresponding arithmetic operation is performed and the result is assigned to the result variable.
If the value does not match any of the cases, the default case is executed, which prints an error message indicating an invalid operator.
Finally, the result is returned.
 */