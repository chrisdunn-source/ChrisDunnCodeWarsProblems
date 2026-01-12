/*
Find Mean
Find the mean (average) of a list of numbers in an array.

Information
To find the mean (average) of a set of numbers add all of the numbers together and divide by the number of values in the list.

For an example list of 1, 3, 5, 7

1. Add all of the numbers

1+3+5+7 = 16
2. Divide by the number of values in the list. In this example there are 4 numbers in the list.

16/4 = 4
3. The mean (or average) of this list is 4
*/

public class GrassHopper {
    
    // Method to find the average of an array of numbers
    public static double findAverage(int[] nums) {
        // Initialize a variable to store the sum of numbers
        int sum = 0;
        
        // Calculate the sum of numbers in the array
        for (int num : nums) {
            sum += num;
        }
        
        // Calculate the average by dividing the sum by the number of elements
        double average = (double) sum / nums.length;
        
        // Return the calculated average
        return average;
    }
}
