package July2024;

public class AgeCalculator {
    public static String CalculateAge(int birth, int yearTo) {
        if (birth == yearTo) { // Check if birth year is equal to year to calculate
            return "You were born this very year!";
        } else if (birth > yearTo) { // Check if birth year is greater than year to calculate
            int difference = birth - yearTo; // Calculate the difference between birth year and year to calculate
            String plural = difference > 1 ? "years" : "year"; // Determine whether to use "year" or "years"
            return "You will be born in " + difference + " " + plural + ".";
        } else { // If birth year is less than year to calculate
            int age = yearTo - birth; // Calculate the age by subtracting birth year from year to calculate
            String plural = age > 1 ? "years" : "year"; // Determine whether to use "year" or "years"
            return "You are " + age + " " + plural + " old.";
        }
    }

    public static void main(String[] args) {
        // Testing the CalculateAge function
        System.out.println(CalculateAge(2010, 2022)); // You are 12 years old.
        System.out.println(CalculateAge(2050, 2040)); // You will be born in 10 years.
        System.out.println(CalculateAge(2000, 2000)); // You were born this very year.
    }
}