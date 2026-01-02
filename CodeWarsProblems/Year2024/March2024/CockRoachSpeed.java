package March2024;

public class CockRoachSpeed {
    /*
    Write a function which takes its speed in km per hour and returns it in cm per second, rounded down to the integer (= floored).
    For example:
    1.08 --> 30
    Note! The input is a Real number (actual type is language dependent) and is >= 0. The result should be an Integer.
     */

    public static void main(String[] args) {
        CockRoachSpeed cockroach = new CockRoachSpeed();

        // Test cases
        double speed1 = 1.08;
        int result1 = cockroach.cockroachSpeed(speed1);
        System.out.println("Speed in cm/s for " + speed1 + " km/h: " + result1); // Output: Speed in cm/s for 1.08 km/h: 30

        double speed2 = 5.5;
        int result2 = cockroach.cockroachSpeed(speed2);
        System.out.println("Speed in cm/s for " + speed2 + " km/h: " + result2); // Output: Speed in cm/s for 5.5 km/h: 152

        double speed3 = 12.34;
        int result3 = cockroach.cockroachSpeed(speed3);
        System.out.println("Speed in cm/s for " + speed3 + " km/h: " + result3); // Output: Speed in cm/s for 12.34 km/h: 342

        // You can add more test cases here

    }
    public int cockroachSpeed(double x) {
        // Convert km/h to cm/s
        int speedInCmPerSec = (int) (x * 100000 / 3600);

        // Return the result
        return speedInCmPerSec;
    }
}
