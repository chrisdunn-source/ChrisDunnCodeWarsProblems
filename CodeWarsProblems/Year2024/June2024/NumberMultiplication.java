package June2024;
    /*
    Jack really likes his number five: the trick here is that you have to multiply each number by 5 raised to the number of digits of each numbers, so, for example:

      3 -->    15  (  3 * 5¹)
     10 -->   250  ( 10 * 5²)
    200 --> 25000  (200 * 5³)
      0 -->     0  (  0 * 5¹)
     -3 -->   -15  ( -3 * 5¹)
     */

public class NumberMultiplication {
    public static int multiply(int number) {
        // Find the number of digits in the input number
        int numberOfDigits = String.valueOf(Math.abs(number)).length();

        // Multiply the number by 5 raised to the power of the number of digits
        int result = number * (int) Math.pow(5, numberOfDigits);

        // Return the result
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(multiply(3));    // Multiply 3 by 5^1 = 15
        System.out.println(multiply(10));   // Multiply 10 by 5^2 = 250
        System.out.println(multiply(200));  // Multiply 200 by 5^3 = 25000
        System.out.println(multiply(0));    // Multiply 0 by 5^1 = 0
        System.out.println(multiply(-3));   // Multiply -3 by 5^1 = -15
    }
}
    /*
    In the multiply method, the code performs the following steps:

    int numberOfDigits = String.valueOf(Math.abs(number)).length();: This line calculates the number of digits in the input number. Math.abs(number) is used to get the absolute value of the input number, ensuring we consider negative numbers correctly. String.valueOf() is then used to convert the number to a string, and .length() returns the length of the string, which gives us the number of digits.
    int result = number * (int) Math.pow(5, numberOfDigits);: This line multiplies the input number by 5 raised to the power of the number of digits. Math.pow(5, numberOfDigits) calculates 5 raised to the power of numberOfDigits, and the input number is multiplied by this result.
    In the main method, we have added test cases to validate the multiply method:

    System.out.println(multiply(3));: This test case calls the multiply method with an input of 3. The expected output is 15, as 3 multiplied by 5 raised to the power of 1 equals 15.
    System.out.println(multiply(10));: This test case calls the multiply method with an input of 10. The expected output is 250, as 10 multiplied by 5 raised to the power of 2 equals 250.
    System.out.println(multiply(200));: This test case calls the multiply method with an input of 200. The expected output is 25000, as 200 multiplied by 5 raised to the power of 3 equals 25000.
    System.out.println(multiply(0));: This test case calls the multiply method with an input of 0. The expected output is 0, as 0 multiplied by 5 raised to the power of 1 equals 0.
    System.out.println(multiply(-3));: This test case calls the multiply method with an input of -3. The expected output is -15, as -3 multiplied by 5 raised to the power of 1 equals -15.
     */
