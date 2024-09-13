public class AngleSum {
    /*
    Find the total sum of internal angles (in degrees) in an n-sided simple polygon.
     N will be greater than 2.
     */
    // Method to calculate the sum of internal angles in a polygon
    public static int sumOfAngles(int n) {
        // Calculate the sum of internal angles using the formula: (n-2) * 180
        int sum = (n - 2) * 180;
        // Return the calculated sum
        return sum;
    }

    // Main method to test the sumOfAngles method
    public static void main(String[] args) {
        // Define the number of sides for the polygon
        int n = 5; // Example: 5-sided polygon
        // Calculate the sum of internal angles by calling the sumOfAngles method
        int sum = sumOfAngles(n);
        // Print the result to the console
        System.out.println("Sum of internal angles in a " + n + "-sided polygon: " + sum + " degrees");
    }
}