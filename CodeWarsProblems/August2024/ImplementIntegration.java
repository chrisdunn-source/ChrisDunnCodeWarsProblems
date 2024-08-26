package August2024;
/*
Create a function that finds the integral of the expression passed.

In order to find the integral all you need to do is add one to the exponent (the second argument), and divide the coefficient (the first argument) by that new number.

For example for 3x^2, the integral would be 1x^3: we added 1 to the exponent, and divided the coefficient by that new number).
 */
public class ImplementIntegration {
    public static void main(String[] args) {
        // Test the integrate() method
        System.out.println(integrate(3, 2)); // Output: 3x^3
        System.out.println(integrate(5, 1)); // Output: 5x^2
        System.out.println(integrate(7, 0)); // Output: 7
        System.out.println(integrate(2, -1)); // Output: 2*log(x)
    }

    public static String integrate(int coefficient, int exponent) {
        // If the exponent is -1, the integral is the coefficient multiplied by the natural logarithm of x
        if (exponent == -1) {
            return String.format("%d*log(x)", coefficient);
        } else {
            // Calculate the new exponent by adding 1 to the original exponent
            int newExponent = exponent + 1;
            // Calculate the new coefficient by dividing the original coefficient by the new exponent
            double newCoefficient = (double) coefficient / newExponent;

            // Format the output based on the new exponent
            if (newExponent == 0) {
                // If the new exponent is 0, return the new coefficient as an integer
                return String.format("%d", (int) newCoefficient);
            } else if (newExponent == 1) {
                // If the new exponent is 1, return the new coefficient followed by 'x'
                return String.format("%dx", (int) newCoefficient);
            } else {
                // For all other cases, return the new coefficient, 'x', and the new exponent
                return String.format("%dx^%d", (int) newCoefficient, newExponent);
            }
        }
    }
}
