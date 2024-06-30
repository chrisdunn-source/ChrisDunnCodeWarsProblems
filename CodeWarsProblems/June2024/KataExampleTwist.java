package June2024;
/*
This is an easy twist to the example kata (provided by Codewars when learning how to create your own kata).

Add the value "codewars" to the array websites 1,000 times.
 */
public class KataExampleTwist {
    public static String[] kataExampleTwist() {
        String[] websites = new String[1000]; // Create an array with a length of 1000
        for (int i = 0; i < websites.length; i++) {
            websites[i] = "codewars"; // Assign the value "codewars" to each element of the array
        }
        return websites; // Return the updated array
    }

    public static void main(String[] args) {
        String[] result = kataExampleTwist(); // Call the kataExampleTwist method to get the result

        // Print the elements of the result array
        for (String website : result) {
            System.out.println(website);
        }
    }
}
