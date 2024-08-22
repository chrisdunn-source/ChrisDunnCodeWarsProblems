package August2024;

public class MaxProduct {
    public static void main(String[] args) {
        // Test cases
        int[] array1 = {3, 6, -2, -5, 7, 3};
        int[] array2 = {-23, 4, -3, 8, -12};
        int[] array3 = {1, 0, 1, 0, 1000};

        MaxProduct mp = new MaxProduct();
        System.out.println("Test case 1: " + mp.adjacentElementsProduct(array1)); // Output: 21
        System.out.println("Test case 2: " + mp.adjacentElementsProduct(array2)); // Output: 96
        System.out.println("Test case 3: " + mp.adjacentElementsProduct(array3)); // Output: 1000
    }

    /**
     * Finds the maximum product obtained from multiplying 2 adjacent numbers in the array.
     *
     * @param array the input array of integers
     * @return the maximum product obtained from multiplying 2 adjacent numbers
     */
    public int adjacentElementsProduct(int[] array) {
        // Initialize the maxProduct with the product of the first two elements
        int maxProduct = array[0] * array[1];

        // Iterate through the array starting from the second element (index 1)
        // up to the second-to-last element (index array.length - 2)
        for (int i = 1; i < array.length - 1; i++) {
            // Calculate the product of the current pair of adjacent elements
            int product = array[i] * array[i + 1];

            // Update the maxProduct if the current product is greater
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        // Return the maximum product
        return maxProduct;
    }
}
