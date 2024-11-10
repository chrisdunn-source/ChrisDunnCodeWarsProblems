// Define a new class named Slope
public class Slope {

    // Define a method named slope that takes an array of 4 integers representing two points
    public String slope(int[] points) {
        // Extract the coordinates of the two points from the input array
        int x1 = points[0]; // x-coordinate of the first point
        int y1 = points[1]; // y-coordinate of the first point
        int x2 = points[2]; // x-coordinate of the second point
        int y2 = points[3]; // y-coordinate of the second point

        // Check if the line is vertical (x2 - x1 is 0)
        if (x2 - x1 == 0) {
            // Return "undefined" if the slope is undefined (division by 0)
            return "undefined";
        } else {
            // Calculate the slope of the line using the formula (y2 - y1) / (x2 - x1)
            int slope = (y2 - y1) / (x2 - x1);
            // Convert the calculated slope to a string and return it
            return String.valueOf(slope);
        }
    }

    // Main method for testing the slope calculation
    public static void main(String[] args) {
        // Create an instance of the Slope class
        Slope slopeCalculator = new Slope();
        // Define an array representing two points (1, 2) and (3, 4)
        int[] points = {1, 2, 3, 4};
        // Calculate and print the slope of the line joining the two points
        System.out.println(slopeCalculator.slope(points));
    }
}
