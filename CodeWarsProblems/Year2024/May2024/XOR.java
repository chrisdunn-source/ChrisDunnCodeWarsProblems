package May2024;

public class XOR {
    public static void main(String[] args) {
        // Test case 1: a is true, b is false
        boolean result1 = xor(true, false);
        // Expected output: true
        System.out.println("Test case 1: " + result1);

        // Test case 2: a is false, b is true
        boolean result2 = xor(false, true);
        // Expected output: true
        System.out.println("Test case 2: " + result2);

        // Test case 3: a is true, b is true
        boolean result3 = xor(true, true);
        // Expected output: false
        System.out.println("Test case 3: " + result3);

        // Test case 4: a is false, b is false
        boolean result4 = xor(false, false);
        // Expected output: false
        System.out.println("Test case 4: " + result4);
    }
    public static boolean xor(boolean a, boolean b) {
        // Perform XOR operation using ^ operator
        return a ^ b;
            /*
            The ^ operator in Java is known as the bitwise XOR (exclusive OR) operator. It performs the XOR operation on individual bits of the operands.

            To understand the ^ operator, let's take a look at its behavior:

            If both bits are different (one is 0 and the other is 1), the XOR operation returns 1.

            Example: 1 ^ 0 or 0 ^ 1 results in 1.
            If both bits are the same (both 0 or both 1), the XOR operation returns 0.

            Example: 0 ^ 0 or 1 ^ 1 results in 0.
             */
    }
}
