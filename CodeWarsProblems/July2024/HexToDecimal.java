package July2024;

public class HexToDecimal {

    public static int hexToDec(final String hexString) {
        int decimal = 0;
        String digits = "0123456789ABCDEF";
        String upperCaseHexString = hexString.toUpperCase();

        // Check for invalid input
        for (int i = 0; i < upperCaseHexString.length(); i++) {
            char c = upperCaseHexString.charAt(i);
            if (i == 0 && c == '-') {
                continue; // Skip the negative sign
            }
            if (!digits.contains(String.valueOf(c))) {
                throw new IllegalArgumentException("Invalid input: " + hexString);
            }
        }

        // Determine the sign
        int sign = 1;
        if (upperCaseHexString.charAt(0) == '-') {
            sign = -1;
        }

        // Convert the hexadecimal digits to decimal
        for (int i = (sign == -1 ? 1 : 0); i < upperCaseHexString.length(); i++) {
            char c = upperCaseHexString.charAt(i);
            int digit = digits.indexOf(c);
            decimal = 16 * decimal + digit;
        }

        return decimal * sign;
    }

    public static void main(String[] args) {
        // Test cases
        String hex1 = "A"; // Hexadecimal A is equivalent to decimal 10
        int dec1 = hexToDec(hex1);
        System.out.println(hex1 + " in decimal is: " + dec1);

        String hex2 = "1F"; // Hexadecimal 1F is equivalent to decimal 31
        int dec2 = hexToDec(hex2);
        System.out.println(hex2 + " in decimal is: " + dec2);

        String hex3 = "-2B"; // Hexadecimal -2B is equivalent to decimal -43
        int dec3 = hexToDec(hex3);
        System.out.println(hex3 + " in decimal is: " + dec3);
    }
}