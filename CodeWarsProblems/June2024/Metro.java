package June2024;

import java.util.ArrayList;

/*
There is a bus moving in the city which takes and drops some people at each bus stop.

You are provided with a list (or array) of integer pairs. Elements of each pair represent the number of people that get on the bus (the first item) and the number of people that get off the bus (the second item) at a bus stop.

Your task is to return the number of people who are still on the bus after the last bus stop (after the last array). Even though it is the last bus stop, the bus might not be empty and some people might still be inside the bus, they are probably sleeping there :D

Take a look on the test cases.

Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the returned integer can't be negative.

The second value in the first pair in the array is 0, since the bus is empty in the first bus stop.
 */
class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        int count = 0;  // Initialize the count of passengers on the bus to zero

        // Iterate through each stop in the stops list
        for (int[] stop : stops) {
            count += stop[0];  // Add the number of people getting on at the current stop
            count -= stop[1];  // Subtract the number of people getting off at the current stop
        }

        return count;  // Return the final count of passengers on the bus
    }

    public static void main(String[] args) {
        // Test case 1
        ArrayList<int[]> stops1 = new ArrayList<>();
        stops1.add(new int[]{3, 0});  // 3 people get on, 0 people get off
        stops1.add(new int[]{2, 1});  // 2 people get on, 1 person gets off
        stops1.add(new int[]{5, 2});  // 5 people get on, 2 people get off
        int remainingPassengers1 = countPassengers(stops1);
        System.out.println("Remaining passengers after last stop (Test case 1): " + remainingPassengers1);

        // Test case 2
        ArrayList<int[]> stops2 = new ArrayList<>();
        stops2.add(new int[]{0, 0});  // 0 people get on, 0 people get off
        stops2.add(new int[]{1, 0});  // 1 person gets on, 0 people get off
        stops2.add(new int[]{0, 1});  // 0 people get on, 1 person gets off
        stops2.add(new int[]{2, 3});  // 2 people get on, 3 people get off
        int remainingPassengers2 = countPassengers(stops2);
        System.out.println("Remaining passengers after last stop (Test case 2): " + remainingPassengers2);
    }
}
