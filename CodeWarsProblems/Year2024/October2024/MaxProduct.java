public class MaxProduct {
    // Method to find the maximum product obtained from multiplying 2 adjacent numbers in the array
    public int adjacentElementsProduct(int[] array) {
        int maxProduct = Integer.MIN_VALUE; // Initialize the maximum product variable

        // Iterate through the array to find the maximum product
        for (int i = 0; i < array.length - 1; i++) {
            int product = array[i] * array[i + 1]; // Calculate the product of two adjacent elements
            maxProduct = Math.max(maxProduct, product); // Update the maximum product if a larger product is found
        }

        return maxProduct; // Return the maximum product found
    }

    // Main method with test cases
    public static void main(String[] args) {
        MaxProduct maxProduct = new MaxProduct();

        // Test cases
        int[] testArray1 = {3, 6, -2, -5, 7, 3};
        System.out.println("Maximum product for testArray1: " + maxProduct.adjacentElementsProduct(testArray1));

        int[] testArray2 = {1, 2, 3, 4, 5};
        System.out.println("Maximum product for testArray2: " + maxProduct.adjacentElementsProduct(testArray2));
    }
}
