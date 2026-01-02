package July2024;
/*
Very simple, given a number (integer / decimal / both depending on the language), find its opposite (additive inverse).

Examples:

1: -1
14: -14
-34: 34

 */
public class OppositeNumber {
    public static int opposite(int number) {
        // The additive inverse of a number is the number with the same absolute value
        // but the opposite sign. In other words, if the original number is positive,
        // the additive inverse will be negative, and vice versa.
        // In Java, we can negate the given number by using the unary minus operator `-`.
        // This will return the opposite of the original number.
        return -number;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(opposite(1));     // Output: -1
        System.out.println(opposite(14));    // Output: -14
        System.out.println(opposite(-34));   // Output: 34
        System.out.println(opposite(0.5));   // Output: -0.5
        System.out.println(opposite(-0.75)); // Output: 0.75
    }
}
