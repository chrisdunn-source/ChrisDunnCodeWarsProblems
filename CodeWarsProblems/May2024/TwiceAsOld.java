package May2024;

public class TwiceAsOld {
    // Main method to test the calculateTwiceAsOld method
    public static void main(String[] args) {
        // Test cases
        int dadAge = 40;
        int sonAge = 20;
        int result = calculateTwiceAsOld(dadAge, sonAge);
        System.out.println("Years ago the father was twice as old as the son: " + result);

        dadAge = 30;
        sonAge = 15;
        result = calculateTwiceAsOld(dadAge, sonAge);
        System.out.println("Years ago the father was twice as old as the son: " + result);
    }

    // Method to calculate the number of years ago the father was twice as old as the son
    public static int calculateTwiceAsOld(int dadYears, int sonYears) {
        // Calculate the absolute difference between the double of the son's age and the father's age
        int yearsDifference = Math.abs(sonYears * 2 - dadYears);
        // Return the calculated difference
        return yearsDifference;
    }



}
