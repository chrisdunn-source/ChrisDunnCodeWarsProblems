public class ProductArrayGenerator {
    // Method to generate a product array based on the input array
    public static long[] productArray(int[] numbers) {
        // Calculate the total product of all elements in the input array
        long totalProduct = 1;
        for (int num : numbers) {
            totalProduct *= num;
        }

        // Create an array to store the product array values
        long[] result = new long[numbers.length];
        
        // Calculate the product excluding the current element for each element in the input array
        for (int i = 0; i < numbers.length; i++) {
            result[i] = totalProduct / numbers[i];
        }

        // Return the product array
        return result;
    }

    // Main method to test the productArray method
    public static void main(String[] args) {
        // Test input array
        int[] arr = {10, 3, 5, 6, 2};
        
        // Generate the product array
        long[] prodArray = productArray(arr);

        // Print the product array values
        for (long num : prodArray) {
            System.out.print(num + " ");
        }
    }
}
