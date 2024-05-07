package May2024;

public class BasicOperations {
    /*
    Your task is to create a function that does four basic mathematical operations.

    The function should take three arguments - operation(string/char), value1(number), value2(number).
    The function should return result of numbers after applying the chosen operation.

    Examples(Operator, value1, value2) --> output
    ('+', 4, 7) --> 11
    ('-', 15, 18) --> -3
    ('*', 5, 5) --> 25
    ('/', 49, 7) --> 7
     */
    public static void main(String[] args) {
        // Example usage
        int result = basicMath("+", 5, 3);
        System.out.println(result);  // Output: 8

        result = basicMath("-", 10, 7);
        System.out.println(result);  // Output: 3

        result = basicMath("*", 4, 6);
        System.out.println(result);  // Output: 24

        result = basicMath("/", 20, 5);
        System.out.println(result);  // Output: 4
    }
    public static Integer basicMath(String op, int v1, int v2) {
        // Use a switch statement to determine the operation based on the provided `op` string
        switch (op) {
            case "+":
                // If the operation is addition, return the sum of `v1` and `v2`
                return v1 + v2;
            case "-":
                // If the operation is subtraction, return the difference between `v1` and `v2`
                return v1 - v2;
            case "*":
                // If the operation is multiplication, return the product of `v1` and `v2`
                return v1 * v2;
            case "/":
                // If the operation is division, check if `v2` is zero
                if (v2 != 0) {
                    // If `v2` is not zero, return the quotient of `v1` divided by `v2`
                    return v1 / v2;
                } else {
                    // If `v2` is zero, throw an ArithmeticException to handle division by zero error
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                // If an invalid operation is provided, throw an IllegalArgumentException
                throw new IllegalArgumentException("Invalid operation: " + op);
        }
    }


}
