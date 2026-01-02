public class LeoOscarStatus {

    // This method describes Leo's Oscar status based on the input
    public static String leoOscarDescription(final int oscar) {
        if (oscar > 88) {
            return "Leo got one already!";
        } else if (oscar == 88) {
            return "Leo finally won the oscar! Leo is happy";
        } else if (oscar == 86) {
            return "Not even for Wolf of Wall Street?!";
        } else {
            return "When will you give Leo an Oscar?";
        }
    }

    // Main method to test the leoOscarDescription method
    public static void main(String[] args) {
        // Test cases
        System.out.println(leoOscarDescription(88)); // Output: Leo finally won the oscar! Leo is happy
        System.out.println(leoOscarDescription(86)); // Output: Not even for Wolf of Wall Street?!
        System.out.println(leoOscarDescription(87)); // Output: When will you give Leo an Oscar?
        System.out.println(leoOscarDescription(89)); // Output: Leo got one already!
    }
}
