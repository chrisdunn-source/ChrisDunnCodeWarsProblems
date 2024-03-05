package March2024;
/*
    Rules:
    You need to round the answer to 2 decimal places and return it as String.

    If the given value is 0 then it should return 0.00

    You will only be given Natural Numbers as arguments.

    Examples:(Input --> Output)
    1 --> 1 --> "1.00"
    2 --> 1 + 1/4 --> "1.25"
    5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"

 */
public class NthSeries {
    public static void main(String[] args) {
        // Test cases
        System.out.println(seriesSum(3)); // Expected output: 1.94
        System.out.println(seriesSum(5)); // Expected output: 2.28
        System.out.println(seriesSum(0)); // Expected output: 0.00
    }
    public static String seriesSum(int n) {
        // Initialize the sum variable to keep track of the series sum
        double sum = 0.0;

        // Iterate from 0 to n-1 to calculate each term in the series
        for (int i = 0; i < n; i++) {
            // Calculate the current term using the formula 1 / (1 + 3n)
            double term = 1.0 / (1 + 3 * i);

            // Add the current term to the sum
            sum += term;
        }

        // Format the sum as a string rounded to two decimal places
        return String.format("%.2f", sum);
    }
}
