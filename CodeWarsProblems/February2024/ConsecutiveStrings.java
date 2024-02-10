public class ConsecutiveStrings {
    public static void main(String[] args) {
        /*
        You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.
        Examples:
        strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2
        Concatenate the consecutive strings of strarr by 2, we get:

        treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
        folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
        trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
        blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
        abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]

        Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
        The first that came is "folingtrashy" so
        longest_consec(strarr, 2) should return "folingtrashy".

        In the same way:
        longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
        n being the length of the string array, if n = 0 or k > n or k <= 0 return "" (return Nothing in Elm, "nothing" in Erlang).

        Note
        consecutive strings : follow one after another without an interruption
         */
        String[] strarr1 = {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        int k1 = 2;
        System.out.println(longestConsec(strarr1, k1));  // Output: "folingtrashy"

        String[] strarr2 = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int k2 = 2;
        System.out.println(longestConsec(strarr2, k2));  // Output: "abigailtheta"
    }
    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length; // Get the length of the array

        // Check for invalid inputs: empty array, k greater than array length, or k less than or equal to 0
        if (n == 0 || k > n || k <= 0) {
            return ""; // Return an empty string
        }

        String longest = ""; // Variable to store the longest concatenated string

        // Iterate over the array, stopping at the position where k consecutive strings are possible
        for (int i = 0; i <= n - k; i++) {
            StringBuilder sb = new StringBuilder(); // StringBuilder to build the concatenated string

            // Concatenate k consecutive strings starting from index i
            for (int j = i; j < i + k; j++) {
                sb.append(strarr[j]); // Append the current string to the StringBuilder
            }

            String current = sb.toString(); // Get the concatenated string

            // Check if the current concatenated string is longer than the previous longest string
            if (current.length() > longest.length()) {
                longest = current; // Update the longest string
            }
        }

        return longest; // Return the first longest concatenated string
    }
}
