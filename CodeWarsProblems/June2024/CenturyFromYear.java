package June2024;
    /*
    The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.

    Task
    Given a year, return the century it is in.

    Examples
    1705 --> 18
    1900 --> 19
    1601 --> 17
    2000 --> 20
    2742 --> 28
     */
public class CenturyFromYear {
    public static int century(int number) {
        // Divide the given year by 100 to get the century
        int century = number / 100;

        // Check if there is a remainder, indicating that the year is not a multiple of 100
        if (number % 100 != 0) {
            // If there is a remainder, add 1 to the century
            century++;
        }

        // Return the calculated century
        return century;
    }

    // Main method to test the century method
    public static void main(String[] args) {
        // Test cases
        System.out.println(century(1705)); // Output: 18
        System.out.println(century(1900)); // Output: 19
        System.out.println(century(1601)); // Output: 17
        System.out.println(century(2000)); // Output: 20
        System.out.println(century(2742)); // Output: 28
    }
}
