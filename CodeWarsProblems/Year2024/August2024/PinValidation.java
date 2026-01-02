package August2024;
/*
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

Examples (Input --> Output)
"1234"   -->  true
"12345"  -->  false
"a234"   -->  false
 */
public class PinValidation {
    // Method to validate PIN codes
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

    public static void main(String[] args) {
        // Test cases for validatePin method
        String pin1 = "1234";  // Valid PIN with 4 digits
        String pin2 = "12345"; // Invalid PIN with 5 digits
        String pin3 = "a234";  // Invalid PIN with non-digit character

        // Testing the validatePin method with the test cases
        System.out.println(pin1 + " --> " + validatePin(pin1)); // Should return true
        System.out.println(pin2 + " --> " + validatePin(pin2)); // Should return false
        System.out.println(pin3 + " --> " + validatePin(pin3)); // Should return false
    }
}
