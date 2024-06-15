package June2024;

public class DingleMouse {

    // Method to calculate the ages in human, cat, and dog years
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears; // Variable to store the cat years
        int dogYears; // Variable to store the dog years

        // Check if humanYears is 1
        if (humanYears == 1) {
            catYears = 15; // First year is equivalent to 15 cat years
            dogYears = 15; // First year is equivalent to 15 dog years
        }
        // Check if humanYears is 2
        else if (humanYears == 2) {
            catYears = 24; // Second year is equivalent to 9 cat years + 15 cat years
            dogYears = 24; // Second year is equivalent to 9 dog years + 15 dog years
        }
        // For humanYears greater than 2
        else {
            catYears = 24 + (humanYears - 2) * 4; // Calculate cat years using the formula
            dogYears = 24 + (humanYears - 2) * 5; // Calculate dog years using the formula
        }

        // Return an array with the ages in human, cat, and dog years
        return new int[]{humanYears, catYears, dogYears};
    }

    // Main method to test the humanYearsCatYearsDogYears method
    public static void main(String[] args) {
        // Test cases
        int[] ages1 = humanYearsCatYearsDogYears(1);
        System.out.println("Human Years: " + ages1[0] + ", Cat Years: " + ages1[1] + ", Dog Years: " + ages1[2]);

        int[] ages2 = humanYearsCatYearsDogYears(2);
        System.out.println("Human Years: " + ages2[0] + ", Cat Years: " + ages2[1] + ", Dog Years: " + ages2[2]);

        int[] ages3 = humanYearsCatYearsDogYears(5);
        System.out.println("Human Years: " + ages3[0] + ", Cat Years: " + ages3[1] + ", Dog Years: " + ages3[2]);
    }

}
