/**
 * Problem:
 * You've just moved into a perfectly straight street with exactly n identical houses on either side of the road.
 * Naturally, you would like to find out the house number of the people on the other side of the street.
 * When n = 3, 1 is opposite 6, 3 opposite 4, and 5 opposite 2.
 */

// The HouseOppositeStreet class encapsulates the logic for finding the house number on the opposite side of the street
class HouseOppositeStreet {
    
    // Method to calculate the house number on the opposite side of the street
    public static long overTheRoad(long address, long n) {
        // Calculate the total number of houses on both sides of the street
        long totalHouses = n * 2;
        
        // Calculate the house number on the opposite side of the street
        long oppositeAddress = totalHouses - address + 1;
        
        return oppositeAddress; // Return the calculated house number on the opposite side
    }
    
    // Main method to test the overTheRoad method with sample test cases
    public static void main(String[] args) {
        // Test cases
        System.out.println(overTheRoad(1, 3)); // Expected output: 6
        System.out.println(overTheRoad(3, 3)); // Expected output: 4
        System.out.println(overTheRoad(2, 3)); // Expected output: 5
        System.out.println(overTheRoad(3, 5)); // Expected output: 8
    }
}
