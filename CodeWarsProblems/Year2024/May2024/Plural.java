package May2024;

public class Plural {
    /**
     * Determines if a plural is needed based on the given number.
     *
     * @param number the number to check
     * @return true if a plural should be used, false otherwise
     */
    public static boolean isPlural(float number) {
        return number != 1f;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPlural(0f));    // true
        System.out.println(isPlural(0.5f));  // true
        System.out.println(isPlural(1f));    // false
        System.out.println(isPlural(100f));  // true
    }
}
