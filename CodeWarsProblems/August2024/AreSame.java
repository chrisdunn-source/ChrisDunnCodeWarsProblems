package August2024;

import java.util.Arrays;
/*
Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements, with the same multiplicities (the multiplicity of a member is the number of times it appears). "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

Examples
Valid arrays
a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
Invalid arrays
If, for example, we change the first number to something else, comp is not returning true anymore:

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 132 is not the square of any number of a.

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 36100 is not the square of any number of a.
 */
public class AreSame {

    // Method to compare two arrays for "same" elements with the same multiplicities
    public static boolean comp(int[] a, int[] b) {
        // Check if either array is null
        if (a == null || b == null) {
            return false; // Return false if any array is null
        }

        // Check if the lengths of the arrays are different
        if (a.length != b.length) {
            return false; // Return false if array lengths are different
        }

        // Square all elements in array 'a'
        int[] squaredA = Arrays.stream(a).map(i -> i * i).toArray();

        // Sort the squared 'a' array and array 'b'
        Arrays.sort(squaredA);
        Arrays.sort(b);

        // Compare each element in the squared 'a' array with the corresponding element in array 'b'
        for (int i = 0; i < squaredA.length; i++) {
            if (squaredA[i] != b[i]) {
                return false; // Return false if elements do not match
            }
        }

        // Return true if all elements match
        return true;
    }

    // Main method to test the 'comp' function with sample test cases
    public static void main(String[] args) {
        // Test case 1: Valid arrays
        int[] a1 = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b1 = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a1, b1)); // Output should be true

        // Test case 2: Invalid arrays
        int[] a2 = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b2 = {132, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a2, b2)); // Output should be false
    }
}