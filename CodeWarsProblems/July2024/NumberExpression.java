public class NumberExpression{
    /**
     * Converts a number into its expanded form.
     *
     * @param num The number to be converted.
     * @return The expanded form of the number.
     */
    public static String expandedForm(int num) {
        String numString = String.valueOf(num);
        StringBuilder expandedForm = new StringBuilder();

        // Iterate over each digit in the number
        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));

            // If the digit is non-zero, append it to the expanded form
            if (digit != 0) {
                // Add a " + " separator if there are more digits to process
                if (expandedForm.length() > 0) {
                    expandedForm.append(" + ");
                }

                // Append the digit multiplied by the appropriate power of 10
                expandedForm.append(digit * (int) Math.pow(10, numString.length() - i - 1));
            }
        }

        return expandedForm.toString();
    }

    /**
     * Main method to test the expandedForm method.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Test cases
        System.out.println(expandedForm(12));     // Output: "10 + 2"
        System.out.println(expandedForm(42));     // Output: "40 + 2"
        System.out.println(expandedForm(70304));  // Output: "70000 + 300 + 4"
    }
}
