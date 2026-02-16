package February2026;

public class BitwiseOperationsTester {

    // The main method where our test cases will be executed
    public static void main(String[] args) {
        // Test cases for bitwise operations
        long number = 5; // Assigning the value 5 to the variable 'number'
        long position = 1; // Assigning the value 1 to the variable 'position'
        long mask = 3; // Assigning the value 3 to the variable 'mask'

        // Output the result of toggling a bit at a specific position
        System.out.println("Toggle Bit: " + toggleBit(number, position));
        // Output the result of setting a bit at a specific position
        System.out.println("Set Bit: " + setBit(number, position));
        // Output the result of clearing a bit at a specific position
        System.out.println("Clear Bit: " + clearBit(7, position));
        // Output whether a bit at a specific position is set to 1
        System.out.println("Is Bit Set: " + isBitSet(number, 0));
        // Output the result of setting multiple bits using a mask
        System.out.println("Set Multiple Bits: " + setMultipleBits(number, mask));
        // Output the result of clearing multiple bits using a mask
        System.out.println("Clear Multiple Bits: " + clearMultipleBits(7, 2));
        // Output the result of toggling multiple bits using a mask
        System.out.println("Toggle Multiple Bits: " + toggleMultipleBits(number, mask));
    }

    // Toggles (flips) the bit at the given position
    public static long toggleBit(long n, long position) {
        return n ^ (1 << position);
    }

    // Sets the bit at the given position to 1
    public static long setBit(long n, long position) {
        return n | (1 << position);
    }

    // Clears (sets to 0) the bit at the given position
    public static long clearBit(long n, long position) {
        return n & ~(1 << position);
    }

    // Checks whether the bit at the given position is set to 1
    public static boolean isBitSet(long n, long position) {
        return (n & (1 << position)) != 0;
    }

    // Sets all bits to 1 wherever the mask has 1s
    public static long setMultipleBits(long n, long mask) {
        return n | mask;
    }

    // Clears all bits wherever the mask has 1s
    public static long clearMultipleBits(long n, long mask) {
        return n & ~mask;
    }

    // Toggles all bits wherever the mask has 1s
    public static long toggleMultipleBits(long n, long mask) {
        return n ^ mask;
    }
}