public class RepeatFunction{
    // Function to repeat the input string 'repeat' times
    public static String repeatStr(final int repeat, final String string) {
        // Create a StringBuilder to efficiently build the repeated string
        StringBuilder sb = new StringBuilder();

        // Repeat the input string 'repeat' times
        for (int i = 0; i < repeat; i++) {
            sb.append(string); // Append the input string to the StringBuilder
        }

        // Return the built string by converting the StringBuilder to a String
        return sb.toString();
    }

    // Main method to test the repeatStr function with example inputs
    public static void main(String[] args) {
        // Test case 1: repeatStr(6, "I") should output "IIIIII"
        System.out.println(repeatStr(6, "I"));

        // Test case 2: repeatStr(5, "Hello") should output "HelloHelloHelloHelloHello"
        System.out.println(repeatStr(5, "Hello"));
    }
}