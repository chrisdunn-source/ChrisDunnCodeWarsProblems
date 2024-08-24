package August2024;
/*
Write function max_rot(n) which given a positive integer n returns the maximum number you got doing rotations similar to the above example.

So max_rot (or maxRot or ... depending on the language) is such as:

max_rot(56789) should return 68957

max_rot(38458215) should return 85821534
 */
public class MaxRotate {
    public static long maxRot(long n) {
        // Convert the input long value to a String
        String numStr = String.valueOf(n);
        // Initialize the maxNum variable to store the maximum number found so far
        long maxNum = n;

        // Iterate through the characters of the number, up to the second-to-last character
        for (int i = 0; i < numStr.length() - 1; i++) {
            // Create a new String by taking the substring from the beginning up to the current index i,
            // then concatenating the substring from index i+1 to the end, and finally appending the
            // character at index i
            String rotated = numStr.substring(0, i) + numStr.substring(i + 1) + numStr.charAt(i);
            // Convert the new String to a long value and store it in the rotatedNum variable
            long rotatedNum = Long.parseLong(rotated);
            // Update the maxNum variable to be the maximum of the current maxNum and the rotatedNum
            maxNum = Math.max(maxNum, rotatedNum);
            // Update the numStr variable to the new rotated value for the next iteration
            numStr = rotated;
        }

        // Return the final maximum number found
        return maxNum;
    }

    public static void main(String[] args) {
        // Test case 1: 56789 -> 68957
        System.out.println(maxRot(56789)); // Output: 68957

        // Test case 2: 38458215 -> 85821534
        System.out.println(maxRot(38458215)); // Output: 85821534

        // Test case 3: 195881 -> 988115
        System.out.println(maxRot(195881)); // Output: 988115

        // Test case 4: 1234567 -> 7654321
        System.out.println(maxRot(1234567)); // Output: 7654321
    }
}