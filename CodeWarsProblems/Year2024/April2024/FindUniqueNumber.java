package April2024;
    /*
    here is an array with some numbers. All numbers are equal except for one. Try to find it!

    Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
    Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
    It’s guaranteed that array contains at least 3 numbers.

    The tests contain some very huge arrays, so think about performance.
     */

public class FindUniqueNumber {
    public static void main(String[] args) {
        // Test cases
        double[] test1 = {1, 1, 1, 2, 1, 1};
        double[] test2 = {0, 0, 0.55, 0, 0};

        System.out.println("Unique number in test1: " + findUniq(test1)); // Expected: 2.0
        System.out.println("Unique number in test2: " + findUniq(test2)); // Expected: 0.55
    }
    public static double findUniq(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true; // Flag to track if the current element is unique

            // Compare each element with the rest of the elements in the array
            for (int j = 0; j < arr.length; j++) {
                // If the elements are the same and they have different indices, it means the current element is not unique
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If the current element is unique, return it
            if (isUnique) {
                return arr[i];
            }
        }

        return -1; // Return a default value if no unique number is found
    }


}
