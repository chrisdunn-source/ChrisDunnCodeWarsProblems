public class LastSurvivor {

    /**
     * This method takes a string of letters and an array of numbers indicating positions of letters to be removed.
     * It removes the letters at the specified positions and returns the only letter left.
     *
     * @param letters The original string of letters
     * @param coords  Array of numbers indicating positions of letters to be removed
     * @return The last survivor letter after removals
     */
   public static String lastSurvivor(String letters, int[] coords) {
    // Create a StringBuilder object with the original string of letters
    StringBuilder sb = new StringBuilder(letters);

    // Iterate through each coordinate in the array
    for (int coord : coords) {
        // Delete the character at the specified position (coordinate) in the StringBuilder
        sb.deleteCharAt(coord);
    }

    // Return the remaining string after all deletions as the last survivor letter
    return sb.toString();
}

    public static void main(String[] args) {
        // Test cases
        System.out.println(lastSurvivor("zbk", new int[]{0, 1})); // Expected output: "b"
        System.out.println(lastSurvivor("abcde", new int[]{1, 2, 3})); // Expected output: "e"
    }
}
