package March2024;
/*
Task
Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
 */
public class ExpressionsMatter {
    public static void main(String[] args) {
        // Test cases
        System.out.println(expressionsMatter(1, 2, 3)); // Output: 9
        System.out.println(expressionsMatter(1, 1, 1)); // Output: 3
        System.out.println(expressionsMatter(2, 10, 3)); // Output: 60
        System.out.println(expressionsMatter(5, 2, 8)); // Output: 80
    }
    public static int expressionsMatter(int a, int b, int c) {
        // Calculate the result of a * (b + c)
        int result1 = a * (b + c);

        // Calculate the result of a * b * c
        int result2 = a * b * c;

        // Calculate the result of a + b * c
        int result3 = a + b * c;

        // Calculate the result of (a + b) * c
        int result4 = (a + b) * c;

        // Calculate the result of a + b + c
        int result5 = a + b + c;

        // Return the largest number among all the results
        return Math.max(Math.max(Math.max(result1, result2), result3), Math.max(result4, result5));
        /*
        The Math.max() method is used to find the maximum value between two numbers. It takes two parameters, let's call them a and b, and returns the larger of the two.
         */
    }
}

    /*
    The code defines a method expressionsMatter that takes three integers a, b, and c as inputs.
    It calculates the result of a * (b + c) and stores it in the variable result1.
    It calculates the result of a * b * c and stores it in the variable result2.
    It calculates the result of a + b * c and stores it in the variable result3.
    It calculates the result of (a + b) * c and stores it in the variable result4.
    It calculates the result of a + b + c and stores it in the variable result5.
    Finally, it returns the largest number among result1, result2, result3, result4, and result5 using the Math.max() method.
     */
