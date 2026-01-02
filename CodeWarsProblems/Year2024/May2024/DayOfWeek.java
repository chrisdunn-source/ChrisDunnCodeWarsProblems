package May2024;

public class DayOfWeek {
    /*
    Complete the function which returns the weekday according to the input number:

    1 returns "Sunday"
    2 returns "Monday"
    3 returns "Tuesday"
    4 returns "Wednesday"
    5 returns "Thursday"
    6 returns "Friday"
    7 returns "Saturday"
    Otherwise returns "Wrong, please enter a number between 1 and 7"
     */
    public static void main(String[] args) {
        int input = 3; // Example input
        System.out.println(getDay(input)); // Output: Tuesday
    }

    // Function to get the weekday based on the input number
    public static String getDay(int n) {
        switch (n) {
            case 1:
                return "Sunday"; // If n is 1, return "Sunday"
            case 2:
                return "Monday"; // If n is 2, return "Monday"
            case 3:
                return "Tuesday"; // If n is 3, return "Tuesday"
            case 4:
                return "Wednesday"; // If n is 4, return "Wednesday"
            case 5:
                return "Thursday"; // If n is 5, return "Thursday"
            case 6:
                return "Friday"; // If n is 6, return "Friday"
            case 7:
                return "Saturday"; // If n is 7, return "Saturday"
            default:
                return "Wrong, please enter a number between 1 and 7";
            // If n is not between 1 and 7, return an error message
        }
    }


}
