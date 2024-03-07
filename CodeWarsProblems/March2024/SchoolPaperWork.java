package March2024;
/*
    Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.

    Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.

    Example:
    n= 5, m=5: 25
    n=-5, m=5:  0
 */
public class SchoolPaperWork {
    /**
     * Main method with test cases.
     */

    public static void main(String[] args) {
        // Test case 1: n = 5, m = 5
        int n1 = 5;
        int m1 = 5;
        int result1 = paperWork(n1, m1);
        System.out.println("Test case 1: " + result1); // Expected output: 25

        // Test case 2: n = -5, m = 5
        int n2 = -5;
        int m2 = 5;
        int result2 = paperWork(n2, m2);
        System.out.println("Test case 2: " + result2); // Expected output: 0

        // Test case 3: n = 0, m = 10
        int n3 = 0;
        int m3 = 10;
        int result3 = paperWork(n3, m3);
        System.out.println("Test case 3: " + result3); // Expected output: 0
    }
    /**
     * Calculates the number of blank pages required to copy paperwork for all classmates.
     *
     * @param n The number of classmates.
     * @param m The number of pages in the paperwork.
     * @return The total number of blank pages required.
     */
    public static int paperWork(int n, int m) {
        // Check if n or m is less than 0
        if (n < 0 || m < 0) {
            return 0; // Return 0 if either n or m is negative
        }

        // Calculate the total number of blank pages
        return n * m;
    }
}
