package July2024;
/*
Your task is to find the nearest square number, nearest_sq(n) or nearestSq(n), of a positive integer n.

For example, if n = 111, then nearest\_sq(n) (nearestSq(n)) equals 121, since 111 is closer to 121, the square of 11, than 100, the square of 10.

If the n is already the perfect square (e.g. n = 144, n = 81, etc.), you need to just return n.
 */

public class NearestSquare {
    public static int nearestSq(final int n){
        // Calculate the square root of the given number
        int sqrtN = (int) Math.sqrt(n);

        // Find the lower and upper square numbers
        int lowerSquare = sqrtN * sqrtN;
        int upperSquare = (sqrtN + 1) * (sqrtN + 1);

        // Compare the distances from the given number to the lower and upper squares
        if (n - lowerSquare <= upperSquare - n) {
            return lowerSquare; // Return the lower square if closer
        } else {
            return upperSquare; // Return the upper square if closer
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(nearestSq(111)); // Should return 121
        System.out.println(nearestSq(144)); // Should return 144 (already a perfect square)
        System.out.println(nearestSq(50)); // Should return 49
    }
}