public class Grasshopper {
    /*
    Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.

    Numerical Score	Letter Grade
    90 <= score <= 100	'A'
    80 <= score < 90	'B'
    70 <= score < 80	'C'
    60 <= score < 70	'D'
    0 <= score < 60	'F'
    Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.
     */
    public static void main(String[] args) {
        // Test case 1: Average grade is 85, expected letter grade is 'B'
        int s1 = 80;
        int s2 = 90;
        int s3 = 80;
        char grade = Grasshopper.getGrade(s1, s2, s3);
        System.out.println("Test case 1: Average grade is 85, expected letter grade is 'B'");
        System.out.println("Actual letter grade: " + grade);
        System.out.println();

        // Test case 2: Average grade is 70, expected letter grade is 'C'
        s1 = 70;
        s2 = 75;
        s3 = 70;
        grade = Grasshopper.getGrade(s1, s2, s3);
        System.out.println("Test case 2: Average grade is 70, expected letter grade is 'C'");
        System.out.println("Actual letter grade: " + grade);
        System.out.println();

        // Test case 3: Average grade is 62, expected letter grade is 'D'
        s1 = 60;
        s2 = 65;
        s3 = 60;
        grade = Grasshopper.getGrade(s1, s2, s3);
        System.out.println("Test case 3: Average grade is 62, expected letter grade is 'D'");
        System.out.println("Actual letter grade: " + grade);
        System.out.println();

        // Test case 4: Average grade is 45, expected letter grade is 'F'
        s1 = 40;
        s2 = 50;
        s3 = 45;
        grade = Grasshopper.getGrade(s1, s2, s3);
        System.out.println("Test case 4: Average grade is 45, expected letter grade is 'F'");
        System.out.println("Actual letter grade: " + grade);
        System.out.println();
    }
    public static char getGrade(int s1, int s2, int s3) {
        // Calculate the average grade by summing up the three scores and dividing by 3
        int averageGrade = (s1 + s2 + s3) / 3;

        // Determine the letter grade based on the average grade
        if (averageGrade >= 90 && averageGrade <= 100) {
            // If the average grade is between 90 and 100 (inclusive), return 'A'
            return 'A';
        } else if (averageGrade >= 80 && averageGrade < 90) {
            // If the average grade is between 80 and 89, return 'B'
            return 'B';
        } else if (averageGrade >= 70 && averageGrade < 80) {
            // If the average grade is between 70 and 79, return 'C'
            return 'C';
        } else if (averageGrade >= 60 && averageGrade < 70) {
            // If the average grade is between 60 and 69, return 'D'
            return 'D';
        } else {
            // If the average grade is less than 60, return 'F'
            return 'F';
        }
    }
}
/*
In the code above, the average grade is calculated by summing up the three scores (s1, s2, and s3) and dividing the sum by 3. Then, based on the value of the average grade, the function determines the corresponding letter grade using if-else statements. Finally, the letter grade is returned as a character.
 */