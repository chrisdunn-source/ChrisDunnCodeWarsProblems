public class Triangle {
    public static void main(String[] args) {
        int angle1 = 45;
        int angle2 = 60;
        int angle3 = findThirdAngle(angle1, angle2);
        System.out.println("The third angle is: " + angle3);
    }
    public static int findThirdAngle(int angle1, int angle2) {
        // Check if the given angles are valid
        if (angle1 <= 0 || angle2 <= 0) {
            throw new IllegalArgumentException("Angles must be positive integers.");
            /*
            throw is a keyword in Java used to explicitly throw an exception.
            new IllegalArgumentException() creates a new instance of the IllegalArgumentException class. This is a type of exception that is commonly used when there is an illegal or inappropriate argument passed to a method or constructor.
            "Angles must be positive integers." is a string message passed as an argument to the IllegalArgumentException constructor. This message provides a description of the error that occurred.
             */
        }

        // Calculate the third angle
        int angle3 = 180 - angle1 - angle2;

        return angle3;
    }
}
/**
 * Explaining the code
 *
 * The findThirdAngle function takes two parameters angle1 and angle2, representing the interior angles of a triangle in degrees.
 * The function first checks if the given angles are valid. In this case, it checks if the angles are positive integers. If either of the angles is not a positive integer, it throws an IllegalArgumentException.
 * If the angles are valid, the function calculates the third angle by subtracting the sum of angle1 and angle2 from 180 (since the sum of the interior angles of a triangle is always 180 degrees).
 * The function returns the value of the third angle.
 * In the main function, an example usage is shown. Two angles, angle1 and angle2, are given as 45 and 60 degrees, respectively. The findThirdAngle function is called with these angles, and the result is stored in angle3. Finally, the value of angle3 is printed to the console.
 */