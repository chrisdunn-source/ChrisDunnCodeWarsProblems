package May2024;

public class FuelShortage {
    public static void main(String[] args) {
        // Test cases
        double distance = 50.0;
        double milesPerGallon = 25.0;
        double fuel = 2.0;
        boolean canReachPump = zeroFuel(distance, milesPerGallon, fuel);
        System.out.println("Can reach the pump: " + canReachPump);

        distance = 100.0;
        milesPerGallon = 20.0;
        fuel = 5.0;
        canReachPump = zeroFuel(distance, milesPerGallon, fuel);
        System.out.println("Can reach the pump: " + canReachPump);
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        double maxDistance = mpg * fuelLeft; // Calculate the maximum distance the car can travel with the remaining fuel
        return maxDistance >= distanceToPump; // Compare the maximum distance with the distance to the pump
    }


}
