/*
Problem:
Two red beads are placed between every two blue beads. Calculate the number of red beads based on the given number of blue beads.

Example arrangement:
@ @@ @ @@ @ @@ @ @@ @ @

Implement countRedBeads(n) so that it returns the number of red beads.
If there are less than 2 blue beads, return 0.
*/

public class BeadsCounter {
    // Method to count the number of red beads based on the number of blue beads
    public static int countRedBeads(final int nBlue) {
        // Check if there are less than 2 blue beads
        if (nBlue < 2) {
            return 0; // Return 0 red beads if there are less than 2 blue beads
        } else {
            // Calculate the number of red beads based on the formula: 2 red beads between every 2 blue beads, except for the last blue bead
            return (nBlue - 1) * 2;
        }
    }

    // Main method to test the countRedBeads method
    public static void main(String[] args) {
        int blueBeads = 7; // Number of blue beads to test
        // Print the number of red beads calculated by the countRedBeads method
        System.out.println("Number of red beads: " + countRedBeads(blueBeads));
    }
}
