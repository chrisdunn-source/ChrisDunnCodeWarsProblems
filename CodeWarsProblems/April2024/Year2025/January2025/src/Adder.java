/**
 * Problem:
 * Create a function add(n)/Add(n) which returns a function that always adds n to any number.
 */

import java.util.function.IntUnaryOperator;

public class Adder {

    // Method that returns a function adding 'n' to any number
    public static IntUnaryOperator createAdder(int n) {
        // Return a lambda expression that adds 'n' to the input number
        return num -> num + n;
    }

    public static void main(String[] args) {
        // Test cases
        IntUnaryOperator addTwo = createAdder(2);
        System.out.println(addTwo.applyAsInt(3)); // Output: 5

        IntUnaryOperator addTen = createAdder(10);
        System.out.println(addTen.applyAsInt(5)); // Output: 15
    }
}