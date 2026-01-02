package June2024;

public class TotalPoints {
    public static int calculatePoints(String[] matchResults) {
        int totalPoints = 0;

        // Iterate over each match result
        for (String matchResult : matchResults) {
            // Split the match result into scores using ":" as the delimiter
            String[] scores = matchResult.split(":");
            int ourScore = Integer.parseInt(scores[0]); // Extract our team's score
            int opponentsScore = Integer.parseInt(scores[1]); // Extract opponent's score

            if (ourScore > opponentsScore) {
                totalPoints += 3; // 3 points for a win
            } else if (ourScore == opponentsScore) {
                totalPoints += 1; // 1 point for a tie
            }
        }

        return totalPoints;
    }

    public static void main(String[] args) {
        // Test cases
        String[] matchResults1 = {"3:1", "2:2", "0:1", "4:0", "1:1", "2:1", "1:0", "3:3", "0:3", "2:0"};
        int points1 = calculatePoints(matchResults1);
        System.out.println("Points 1: " + points1); // Expected output: 17

        String[] matchResults2 = {"1:0", "0:0", "1:2", "2:1", "0:1", "1:0", "1:1", "2:3", "0:2", "1:0"};
        int points2 = calculatePoints(matchResults2);
        System.out.println("Points 2: " + points2); // Expected output: 13

        String[] matchResults3 = {"0:0", "0:0", "0:0", "0:0", "0:0", "0:0", "0:0", "0:0", "0:0", "0:0"};
        int points3 = calculatePoints(matchResults3);
        System.out.println("Points 3: " + points3); // Expected output: 10
    }
}