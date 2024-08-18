package August2024;
/*
Your task, is to create N×N multiplication table, of size provided in parameter.

For example, when given size is 3:

1 2 3
2 4 6
3 6 9
For the given example, the return value should be:

[[1,2,3],[2,4,6],[3,6,9]]
 */

public class Multiplication {

    // Method to generate an N×N multiplication table
    public static int[][] multiplicationTable(int n) {
        // Create a 2D array to store the multiplication table
        int[][] table = new int[n][n];

        // Iterate over rows (i) and columns (j) to fill in the table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Calculate the multiplication result and store it in the table
                table[i-1][j-1] = i * j;
            }
        }

        // Return the generated multiplication table
        return table;
    }

    public static void main(String[] args) {
        // Generate a multiplication table with size 3
        int[][] result = multiplicationTable(3);

        // Display the generated multiplication table
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " "); // Print each element of the table
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}
