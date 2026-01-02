package July2024;

import java.util.function.IntPredicate;
/*
Create a method all which takes two params:

a sequence
a function (function pointer in C)
and returns true if the function in the params returns true for every element in the sequence. Otherwise, it should return false. If the sequence is empty, it should return true, since technically nothing failed the test.

Example
all((1, 2, 3, 4, 5), greater_than_9) -> false
all((1, 2, 3, 4, 5), less_than_9)    -> True

 */

public class JavaMethod {
    // Method to check if the predicate function returns true for every element in the list
    public static boolean all(int[] list, IntPredicate predicate) {
        for (int num : list) {
            if (!predicate.test(num)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test case: numbers array containing 1, 2, 3, 4, 5
        int[] numbers = {1, 2, 3, 4, 5};

        // Predicate function to check if a number is greater than 9
        IntPredicate greaterThan9 = n -> n > 9;
        // Predicate function to check if a number is less than 9
        IntPredicate lessThan9 = n -> n < 9;

        // Testing the 'all' method with the greaterThan9 predicate function
        System.out.println("Testing greaterThan9:");
        System.out.println("Expected: false");
        System.out.println("Actual: " + all(numbers, greaterThan9)); // Output: false
        System.out.println();

        // Testing the 'all' method with the lessThan9 predicate function
        System.out.println("Testing lessThan9:");
        System.out.println("Expected: true");
        System.out.println("Actual: " + all(numbers, lessThan9)); // Output: true
    }
}