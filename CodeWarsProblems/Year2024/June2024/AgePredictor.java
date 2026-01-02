package June2024;

public class AgePredictor {
    /*
    My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!

    In honor of my grandfather's memory we will write a function using his formula!

    Take a list of ages when each of your great-grandparent died.
    Multiply each number by itself.
    Add them all together.
    Take the square root of the result.
    Divide by two.
    Example
    predictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
    Note: the result should be rounded down to the nearest integer.
     */
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        // Calculate the sum of the squares of the ages
        int sum = age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4 + age5 * age5 + age6 * age6 + age7 * age7 + age8 * age8;

        // Take the square root of the sum and divide it by 2
        double result = Math.sqrt(sum) / 2;

        // Cast the result to an integer and return it
        return (int) result;
    }

    public static void main(String[] args) {
        // Test cases
        int age1 = 65, age2 = 60, age3 = 75, age4 = 55, age5 = 60, age6 = 63, age7 = 64, age8 = 45;

        // Call the predictAge method with the test case values
        int predictedAge = predictAge(age1, age2, age3, age4, age5, age6, age7, age8);

        // Print the predicted age to the console
        System.out.println("Predicted age: " + predictedAge);
    }
}
    /*
    public class Solution {
    This line declares the Solution class.
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
    This line declares the predictAge method that takes eight integer parameters representing the ages of the great-grandparents.
    int sum = age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4 + age5 * age5 + age6 * age6 + age7 * age7 + age8 * age8;
    This line calculates the sum of the squares of the ages by multiplying each age by itself and adding them together. The result is stored in the variable sum.
    double result = Math.sqrt(sum) / 2;
    Here, we take the square root of the sum using the Math.sqrt() method from the Math class. Then, we divide the square root by 2 and store the result in the variable result. Note that Math.sqrt() returns a double value.
    return (int) result;
    Finally, we cast the result variable to an integer using (int) to round down the value to the nearest integer. This is necessary because the expected return type of the method is int.
    public static void main(String[] args) {
    This line declares the main method, the entry point of the program.
    int age1 = 65, age2 = 60, age3 = 75, age4 = 55, age5 = 60, age6 = 63, age7 = 64, age8 = 45;
    These lines declare and initialize the test case variables with age values.
    int predictedAge = predictAge(age1, age2, age3, age4, age5, age6, age7, age8);
    This line calls the predictAge method with the test case values and stores the predicted age in the predictedAge variable.
    System.out.println("Predicted age: " + predictedAge);
    This line prints the predicted age to the console.
     */
