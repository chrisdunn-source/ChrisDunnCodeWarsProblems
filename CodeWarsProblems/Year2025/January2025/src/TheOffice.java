/*
 * Problem:
 * Assess the team's boredom level based on their departments and scores. Return the appropriate sentiment based on the cumulative score:
 * <=80: 'kill me now'
 * < 100 & > 80: 'i can handle this'
 * 100 or over: 'party time!!'
 */

import java.util.HashMap;
import java.util.Map;

public class TheOffice {
    
    // Method to assess team boredom level and return the appropriate sentiment
    public static String boredom(Person[] staff) {
        // Map to store department scores
        Map<String, Integer> departmentScores = new HashMap<>();
        departmentScores.put("accounts", 1);
        departmentScores.put("finance", 2);
        departmentScores.put("canteen", 10);
        departmentScores.put("regulation", 3);
        departmentScores.put("trading", 6);
        departmentScores.put("change", 6);
        departmentScores.put("IS", 8);
        departmentScores.put("retail", 5);
        departmentScores.put("cleaning", 4);
        departmentScores.put("pissing about", 25);

        int totalScore = 0;

        // Calculate the total score of the team based on their departments
        for (Person person : staff) {
            if (departmentScores.containsKey(person.department)) {
                totalScore += departmentScores.get(person.department);
            }
        }

        // Determine the sentiment based on the total score
        if (totalScore <= 80) {
            return "kill me now";
        } else if (totalScore < 100) {
            return "i can handle this";
        } else {
            return "party time!!";
        }
    }

    public static void main(String[] args) {
        // You can test the boredom method here if needed
    }
}
