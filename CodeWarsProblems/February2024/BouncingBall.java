public class BouncingBall {
    /*
    A child is playing with a ball on the nth floor of a tall building. The height of this floor above ground level, h, is known.
    He drops the ball out of the window. The ball bounces (for example), to two-thirds of its height (a bounce of 0.66).
    His mother looks out of a window 1.5 meters from the ground.
    How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing)?
    Three conditions must be met for a valid experiment:
    Float parameter "h" in meters must be greater than 0
    Float parameter "bounce" must be greater than 0 and less than 1
    Float parameter "window" must be less than h.
    If all three conditions above are fulfilled, return a positive integer, otherwise return -1.
    Note:
    The ball can only be seen if the height of the rebounding ball is strictly greater than the window parameter.
    Examples:
    - h = 3, bounce = 0.66, window = 1.5, result is 3
    - h = 3, bounce = 1, window = 1.5, result is -1
    (Condition 2) not fulfilled).
     */
    public static void main(String[] args) {
        // Test Case 1
        double h1 = 3.0;
        double bounce1 = 0.66;
        double window1 = 1.5;
        int result1 = bouncingBall(h1, bounce1, window1);
        System.out.println("Test Case 1: " + result1); // Expected Output: 3

        // Test Case 2
        double h2 = 3.0;
        double bounce2 = 1.0;
        double window2 = 1.5;
        int result2 = bouncingBall(h2, bounce2, window2);
        System.out.println("Test Case 2: " + result2); // Expected Output: -1

        // Test Case 3
        double h3 = 10.0;
        double bounce3 = 0.5;
        double window3 = 2.0;
        int result3 = bouncingBall(h3, bounce3, window3);
        System.out.println("Test Case 3: " + result3); // Expected Output: 7

        // Test Case 4
        double h4 = 5.0;
        double bounce4 = 0.8;
        double window4 = 2.5;
        int result4 = bouncingBall(h4, bounce4, window4);
        System.out.println("Test Case 4: " + result4); // Expected Output: 1

        // Test Case 5
        double h5 = 0.0;
        double bounce5 = 0.5;
        double window5 = 1.0;
        int result5 = bouncingBall(h5, bounce5, window5);
        System.out.println("Test Case 5: " + result5); // Expected Output: -1

    }
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1; // Conditions not fulfilled
        }

        int count = 1; // The ball is initially dropped, so we start with one pass in front of the window

        while (h * bounce > window) {
            count += 2; // The ball passes the window twice: on the way down and on the way up
            h *= bounce; // Update the height of the ball after each bounce
        }

        return count;
    }
}
/*
The code starts with the declaration of a method called bouncingBall that takes three input parameters: h, bounce, and window. These parameters represent the height of the floor, the bounce factor of the ball, and the height of the window respectively. The method is declared as public static int, which means it returns an integer value.

Inside the method, there is an if statement that checks three conditions to determine if the experiment is valid. These conditions are:

h must be greater than 0.
bounce must be greater than 0 and less than 1.
window must be less than h.
If any of these conditions are not fulfilled, the method returns -1, indicating an invalid experiment.

After the condition check, we initialize a variable called count to 1. This variable will keep track of the number of times the ball passes in front of the window. We set it to 1 because the ball is initially dropped, so it passes the window once.

The code then enters a while loop that continues as long as the height of the ball after bouncing is greater than the window height. In other words, it keeps bouncing until the ball's height becomes lower than the window.

Inside the loop, we increment the count variable by 2. This is because the ball passes the window twice: once on the way down and once on the way up after bouncing.

We also update the height of the ball by multiplying it with the bounce factor (bounce). This simulates the ball bouncing and losing some height with each bounce.

Once the while loop condition is no longer true, it means the ball's height is lower than the window height, and it won't be visible anymore. At this point, the loop exits.

Finally, we return the count variable, which represents the total number of times the ball passed in front of the window during the bouncing process.
 */