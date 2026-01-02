public class Grader {
    /*
    Create a function that takes a number as an argument and returns a grade based on that number.

Score	Grade
Anything greater than 1 or less than 0.6	"F"
0.9 or greater	"A"
0.8 or greater	"B"
0.7 or greater	"C"
0.6 or greater	"D"
Examples:

grader(0)   should be "F"
grader(1.1) should be "F"
grader(0.9) should be "A"
grader(0.8) should be "B"
grader(0.7) should be "C"
grader(0.6) should be "D"
     */
    // Method to grade a score and return the corresponding grade
    public static String grader(double score) {
        // Check if the score is outside the valid range
        if (score > 1 || score < 0.6) {
            return "F"; // Return "F" if score is too high or too low
        } else if (score >= 0.9) {
            return "A"; // Return "A" if score is 0.9 or higher
        } else if (score >= 0.8) {
            return "B"; // Return "B" if score is 0.8 or higher
        } else if (score >= 0.7) {
            return "C"; // Return "C" if score is 0.7 or higher
        } else {
            return "D"; // Return "D" if score is 0.6 or higher
        }
    }

    // Main method to test the grader function
    public static void main(String[] args) {
        // Test cases
        System.out.println(grader(0));   // Should print "F"
        System.out.println(grader(1.1)); // Should print "F"
        System.out.println(grader(0.9)); // Should print "A"
        System.out.println(grader(0.8)); // Should print "B"
        System.out.println(grader(0.7)); // Should print "C"
        System.out.println(grader(0.6)); // Should print "D"
    }
}
