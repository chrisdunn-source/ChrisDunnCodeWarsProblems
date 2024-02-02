public class ArrayOfTests {
    /*
    You receive an array with your peers' test scores. Now calculate the average and compare your score!
    Return True if you're better, else False!
     */
    public static void main(String[] args) {
        int[] classPoints = {80, 75, 90, 85, 95};
        int yourPoints = 88;

        // Call the betterThanAverage method to compare your score with the average.
        boolean result = betterThanAverage(classPoints, yourPoints);

        // Print the result.
        System.out.println("Your score is better than the average: " + result);
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;

        // Step 1: Calculate the sum of all the test scores in the array.
        for (int score : classPoints) {
            sum += score;
        }

        // Step 2: Divide the sum by the total number of test scores to get the average.
        int average = sum / classPoints.length;

        // Step 3: Compare your own score with the average.
        // Step 4: Return true if your score is greater than the average, or false otherwise.
        return yourPoints > average;
    }
}
