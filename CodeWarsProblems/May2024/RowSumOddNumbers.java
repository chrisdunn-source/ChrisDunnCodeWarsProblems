package May2024;

        /*
        Given the triangle of consecutive odd numbers:

                     1
                  3     5
               7     9    11
           13    15    17    19
        21    23    25    27    29
        ...
        Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

        1 -->  1
        2 --> 3 + 5 = 8
         */
class RowSumOddNumbers {
    public static void main(String[] args) {
        // Test cases
        System.out.println(rowSumOddNumbers(1));  // Expected output: 1
        System.out.println(rowSumOddNumbers(2));  // Expected output: 8
        System.out.println(rowSumOddNumbers(3));  // Expected output: 27
        System.out.println(rowSumOddNumbers(4));  // Expected output: 64
    }

    public static int rowSumOddNumbers(int n) {
        // Calculate the first number of the nth row
        int firstNumber = (n - 1) * n + 1;

        // Initialize the sum variable
        int sum = 0;

        // Iterate n times to calculate the sum of n consecutive odd numbers
        for (int i = 0; i < n; i++) {
            // Add each consecutive odd number to the sum
            sum += firstNumber + 2 * i;
        }

        // Return the sum
        return sum;
    }
}
