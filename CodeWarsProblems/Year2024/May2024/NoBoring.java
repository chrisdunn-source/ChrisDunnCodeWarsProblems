package May2024;

public class NoBoring {
    public static void main(String[] args) {
        // Test cases to verify the functionality of the noBoringZeros method
        System.out.println(noBoringZeros(1450));    // Expected output: 145
        System.out.println(noBoringZeros(960000));  // Expected output: 96
        System.out.println(noBoringZeros(1050));    // Expected output: 105
        System.out.println(noBoringZeros(-1050));   // Expected output: -105
        System.out.println(noBoringZeros(0));       // Expected output: 0
    }

    /**
     * Removes the boring trailing zeros from a given number.
     *
     * @param n the number from which to remove boring trailing zeros
     * @return the number without the boring trailing zeros
     */
    public static int noBoringZeros(int n) {
        // Check if the number is zero
        if (n == 0) {
            return 0; // Zero alone is fine, no need to remove anything
        }

        // Keep dividing by 10 until the last digit is non-zero
        while (n % 10 == 0) {
            n /= 10;
        }

        return n;
    }
}
