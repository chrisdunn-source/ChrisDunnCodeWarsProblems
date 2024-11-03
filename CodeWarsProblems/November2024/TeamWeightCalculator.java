public class TeamWeightCalculator {

    // This method calculates the total weights of two teams based on the given weights array
    public static int[] rowWeights(final int[] weights) {
        // Initialize variables to store the total weights for each team
        int team1Weight = 0; // Total weight for Team 1, starts at 0
        int team2Weight = 0; // Total weight for Team 2, starts at 0

        // Loop through each weight in the weights array
        for (int i = 0; i < weights.length; i++) {
            // Check if the index 'i' is even
            if (i % 2 == 0) {
                // If the index is even, add the weight to Team 1's total
                team1Weight += weights[i];
            } else {
                // If the index is odd, add the weight to Team 2's total
                team2Weight += weights[i];
            }
        }

        // After checking all weights, return an array with the totals for both teams
        return new int[]{team1Weight, team2Weight}; // First element is Team 1's weight, second is Team 2's weight
    }

    // The main method is where the program starts running
    public static void main(String[] args) {
        // Test case 1: weights of three people
        int[] test1 = {13, 27, 49}; // Example weights
        int[] result1 = rowWeights(test1); // Call the method to calculate team weights
        // Print the results for test case 1
        System.out.println("Team weights for test case 1: " + result1[0] + ", " + result1[1]); // Should print: 62, 27

        // Test case 2: weights of four people
        int[] test2 = {50, 60, 70, 80}; // Another example
        int[] result2 = rowWeights(test2); // Calculate team weights
        // Print the results for test case 2
        System.out.println("Team weights for test case 2: " + result2[0] + ", " + result2[1]); // Should print: 120, 140

        // Test case 3: weights of five people
        int[] test3 = {1, 2, 3, 4, 5}; // Different set of weights
        int[] result3 = rowWeights(test3); // Calculate team weights
        // Print the results for test case 3
        System.out.println("Team weights for test case 3: " + result3[0] + ", " + result3[1]); // Should print: 9, 6

        // Test case 4: only one person
        int[] test4 = {10}; // Only one weight
        int[] result4 = rowWeights(test4); // Calculate team weights
        // Print the results for test case 4
        System.out.println("Team weights for test case 4: " + result4[0] + ", " + result4[1]); // Should print: 10, 0
    }
}
