package June2024;
/*
    Create a function that returns the CSV representation of a two-dimensional numeric array.

    Example:

    input:
       [[ 0, 1, 2, 3, 4 ],
        [ 10,11,12,13,14 ],
        [ 20,21,22,23,24 ],
        [ 30,31,32,33,34 ]]

    output:
         '0,1,2,3,4\n'
        +'10,11,12,13,14\n'
        +'20,21,22,23,24\n'
        +'30,31,32,33,34'
    Array's length > 2.

    More details here: https://en.wikipedia.org/wiki/Comma-separated_values

    Note: you shouldn't escape the \n, it should work as a new line.
 */

public class CSVrepresentationofarray {
    public static String toCsvText(int[][] array) {
        StringBuilder csvText = new StringBuilder(); // Create a StringBuilder to efficiently build the CSV string

        for (int i = 0; i < array.length; i++) { // Iterate over the rows of the array
            for (int j = 0; j < array[i].length; j++) { // Iterate over the columns of each row
                csvText.append(array[i][j]); // Append the current element to the csvText StringBuilder

                if (j < array[i].length - 1) { // Add a comma if we're not at the last element in the row
                    csvText.append(",");
                }
            }

            if (i < array.length - 1) { // Add a newline character if we're not at the last row
                csvText.append("\n");
            }
        }

        return csvText.toString(); // Return the final CSV string
    }

    public static void main(String[] args) {
        // Test cases
        int[][] array1 = {
                { 0, 1, 2, 3, 4 },
                { 10, 11, 12, 13, 14 },
                { 20, 21, 22, 23, 24 },
                { 30, 31, 32, 33, 34 }
        };

        String csv1 = toCsvText(array1);
        System.out.println(csv1);
        // Expected output:
        // 0,1,2,3,4
        // 10,11,12,13,14
        // 20,21,22,23,24
        // 30,31,32,33,34

        int[][] array2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        String csv2 = toCsvText(array2);
        System.out.println(csv2);
        // Expected output:
        // 1,2,3
        // 4,5,6
        // 7,8,9
    }
}
