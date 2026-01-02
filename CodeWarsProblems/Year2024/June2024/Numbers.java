package June2024;
/*
    Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.

    Example:
    5.5589 is rounded 5.56
    3.3424 is rounded 3.34

 */

public class Numbers {
    public static double TwoDecimalPlaces(double number) {
        // Multiply the number by 100 to shift the decimal places
        double multiplied = number * 100;

        // Round the multiplied number to the nearest integer
        long rounded = Math.round(multiplied);

        // Divide the rounded number by 100 to shift the decimal places back
        double result = (double) rounded / 100;

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        double number1 = 5.5589;
        double number2 = 3.3424;
        double number3 = 9.87654321;

        // Round the numbers to two decimal places
        double rounded1 = TwoDecimalPlaces(number1);
        double rounded2 = TwoDecimalPlaces(number2);
        double rounded3 = TwoDecimalPlaces(number3);

        // Print the original number and the rounded number for each test case
        System.out.println("Original number: " + number1 + ", Rounded number: " + rounded1);
        System.out.println("Original number: " + number2 + ", Rounded number: " + rounded2);
        System.out.println("Original number: " + number3 + ", Rounded number: " + rounded3);
    }
}
