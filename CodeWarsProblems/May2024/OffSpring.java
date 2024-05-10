package May2024;
    /*
    The male gametes or sperm cells in humans and other mammals are heterogametic and contain one of two types of sex chromosomes. They are either X or Y. The female gametes or eggs however, contain only the X sex chromosome and are homogametic.

    The sperm cell determines the sex of an individual in this case. If a sperm cell containing an X chromosome fertilizes an egg, the resulting zygote will be XX or female. If the sperm cell contains a Y chromosome, then the resulting zygote will be XY or male.

    Determine if the sex of the offspring will be male or female based on the X or Y chromosome present in the male's sperm.

    If the sperm contains the X chromosome, return "Congratulations! You're going to have a daughter."; If the sperm contains the Y chromosome, return "Congratulations! You're going to have a son.";
     */
public class OffSpring {
    // Main method to test the chromosomeCheck function
    public static void main(String[] args) {
        // Test cases
        System.out.println(chromosomeCheck("XX")); // Expected: Congratulations! You're going to have a daughter.
        System.out.println(chromosomeCheck("XY")); // Expected: Congratulations! You're going to have a son.
        System.out.println(chromosomeCheck("YY")); // Expected: Congratulations! You're going to have a son.
        System.out.println(chromosomeCheck(""));   // Expected: Invalid input. Please provide either 'X' or 'Y' chromosome.
    }

    // Method to determine the sex of the offspring based on the sperm chromosome
    public static String chromosomeCheck(String sperm) {
        // Check if the sperm contains "Y"
        if (sperm.contains("Y")) {
            return "Congratulations! You're going to have a son."; // If "Y" is present, return message for a son
        }
        // Check if the sperm contains "X"
        else if (sperm.contains("X")) {
            return "Congratulations! You're going to have a daughter."; // If "X" is present, return message for a daughter
        }
        // If neither "Y" nor "X" is found
        else {
            return "Invalid input. Please provide either 'X' or 'Y' chromosome."; // Return error message for invalid input
        }
    }
}
    /*
    Here's a breakdown of the code:

    Line 3-13: The main method is defined, which serves as an entry point to test the chromosomeCheck function.
    Line 5-8: Test cases are provided to demonstrate the expected results of the chromosomeCheck function.
    Line 18-28: The chromosomeCheck method is defined. It takes a String parameter sperm and returns a String indicating the sex of the offspring.
    Line 21: Check if the sperm string contains "Y".
    Line 23: If "Y" is present, return the message for a son.
    Line 26: Check if the sperm string contains "X".
    Line 28: If "X" is present, return the message for a daughter.
    Line 31: If neither "Y" nor "X" is found, return an error message for invalid input.
     */
