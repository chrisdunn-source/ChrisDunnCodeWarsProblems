class RevRot {
    /*
    The input is a string str of digits. Cut the string into chunks (a chunk here is a substring of the initial string) of size sz (ignore the last chunk if its size is less than sz).

If the sum of a chunk's digits is divisible by 2, reverse that chunk; otherwise rotate it to the left by one position. Put together these modified chunks and return the result as a string.

If

sz is <= 0 or if str == "" return ""
sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".
Examples:
("123456987654", 6) --> "234561876549"
("123456987653", 6) --> "234561356789"
("66443875", 4) --> "44668753"
("66443875", 8) --> "64438756"
("664438769", 8) --> "67834466"
("123456779", 8) --> "23456771"
("", 8) --> ""
("123456779", 0) --> ""
("563000655734469485", 4) --> "0365065073456944"
Example of a string rotated to the left by one position:
s = "123456" gives "234561".
     */

    // This method takes a string of digits and a size 'sz'
    public static String revRot(String strng, int sz) {
        // Check if the size is less than or equal to 0
        // or if the string is empty, or if the size is greater than the string's length
        // In any of these cases, we cannot process the input, so we return an empty string
        if (sz <= 0 || strng.isEmpty() || sz > strng.length()) {
            return ""; // Returning an empty string as invalid input
        }

        // A StringBuilder is used to build our result.
        // It allows us to efficiently append strings together.
        StringBuilder result = new StringBuilder();

        // Calculate the number of complete chunks of size 'sz' we can create from 'strng'
        int numChunks = strng.length() / sz;

        // A loop to process each chunk
        for (int i = 0; i < numChunks; i++) {
            // Extract a substring of size 'sz' starting from the current index 'i'
            // The ending index will be (i + 1) * sz, which gives us a full chunk
            String chunk = strng.substring(i * sz, (i + 1) * sz);

            // Initialize a variable to hold the sum of the digits in the chunk
            int sum = 0;

            // A loop to calculate the sum of the digits in the current chunk
            for (char c : chunk.toCharArray()) {
                // Convert the character to its numeric value and add it to the sum
                sum += Character.getNumericValue(c);
            }

            // Check if the sum of the digits in the chunk is even
            if (sum % 2 == 0) {
                // If the sum is even, reverse the chunk
                result.append(new StringBuilder(chunk).reverse().toString());
            } else {
                // If the sum is odd, rotate the chunk to the left by one position
                // The rotated chunk will be the substring starting from index 1
                // plus the first character at index 0
                result.append(chunk.substring(1)).append(chunk.charAt(0));
            }
        }

        // Convert the StringBuilder to a string and return the final result
        return result.toString();
    }

    // A main method for testing the revRot function
    public static void main(String[] args) {
        // Testing various cases of the revRot method
        System.out.println(revRot("123456987654", 6)); // Expected output: "234561876549"
        System.out.println(revRot("123456987653", 6)); // Expected output: "234561356789"
        System.out.println(revRot("66443875", 4)); // Expected output: "44668753"
        System.out.println(revRot("66443875", 8)); // Expected output: "64438756"
        System.out.println(revRot("664438769", 8)); // Expected output: "67834466"
        System.out.println(revRot("123456779", 8)); // Expected output: "23456771"
        System.out.println(revRot("", 8)); // Expected output: ""
        System.out.println(revRot("123456779", 0)); // Expected output: ""
        System.out.println(revRot("563000655734469485", 4)); // Expected output: "0365065073456944"
    }
}