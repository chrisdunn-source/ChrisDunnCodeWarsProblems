package June2024;
/*
You have to write a function that accepts three parameters:

cap is the amount of people the bus can hold excluding the driver.
on is the number of people on the bus excluding the driver.
wait is the number of people waiting to get on to the bus excluding the driver.
If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.

Usage Examples:
cap = 10, on = 5, wait = 5 --> 0 # He can fit all 5 passengers
cap = 100, on = 60, wait = 50 --> 10 # He can't fit 10 of the 50 waiting
 */

public class EnoughSpace {
    public static int enough(int cap, int on, int wait) {
        // Calculate the total number of passengers on the bus
        int totalPassengers = on + wait;

        // Check if there is enough space for all passengers
        if (totalPassengers <= cap) {
            return 0; // There is enough space for all passengers, return 0
        } else {
            return totalPassengers - cap; // Return the number of passengers he can't take
        }
    }

    public static void main(String[] args) {
        // Test cases
        int cap = 10; // Capacity of the bus
        int on = 5; // Number of people already on the bus
        int wait = 5; // Number of people waiting to get on the bus

        // Calculate the number of passengers not taken and store the result
        int passengersNotTaken = enough(cap, on, wait);

        // Print the number of passengers not taken
        System.out.println("Passengers not taken: " + passengersNotTaken);

        // Update test case values
        cap = 100;
        on = 60;
        wait = 50;

        // Calculate the number of passengers not taken and store the result
        passengersNotTaken = enough(cap, on, wait);

        // Print the number of passengers not taken
        System.out.println("Passengers not taken: " + passengersNotTaken);
    }
}
