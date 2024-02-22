public class Goals {
    /**
     * Calculates the total number of goals scored by Messi in all three leagues.
     *
     * @param laLigaGoals          Goals scored by Messi in LaLiga.
     * @param copaDelReyGoals      Goals scored by Messi in Copa del Rey.
     * @param championsLeagueGoals Goals scored by Messi in the Champions League.
     * @return The total number of goals scored by Messi in all three leagues.
     */
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        int totalGoals = laLigaGoals + copaDelReyGoals + championsLeagueGoals;
        return totalGoals;
    }

    public static void main(String[] args) {
        // Test cases
        int goals1 = goals(5, 10, 2);
        System.out.println("Total goals: " + goals1);  // Output: Total goals: 17

        int goals2 = goals(0, 0, 0);
        System.out.println("Total goals: " + goals2);  // Output: Total goals: 0

        int goals3 = goals(20, 5, 8);
        System.out.println("Total goals: " + goals3);  // Output: Total goals: 33
    }
}