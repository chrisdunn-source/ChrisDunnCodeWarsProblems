package August2024;
/*
Description:
This program tests the life of an evaporator containing a gas.

We know the content of the evaporator (content in ml), the percentage of foam or gas lost every day (evap_per_day) and the threshold (threshold) in percentage beyond which the evaporator is no longer useful. All numbers are strictly positive.

The program reports the nth day (as an integer) on which the evaporator will be out of use.

Example:
evaporator(10, 10, 5) -> 29
 */
public class Evaporator {

    public static int evaporator(double content, double evap_per_day, double threshold) {
        int day = 0;
        double remainingContent = 100.0;

        while (remainingContent > threshold) {
            remainingContent -= remainingContent * (evap_per_day / 100);
            day++;
        }

        return day;
    }

    public static void main(String[] args) {
        // Test the evaporator method
        System.out.println(evaporator(10, 10, 5)); // Output should be 29
    }
}
