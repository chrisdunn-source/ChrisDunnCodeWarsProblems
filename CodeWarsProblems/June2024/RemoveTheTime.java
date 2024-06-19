package June2024;
/*
    You're running out of screen real estate, and on some pages you want to display a shorter format, Weekday Month Day that omits the time.

    Write a function that takes the website date/time in its original string format and returns the shortened format.

    Input
    Input will always be a string, e.g., "Friday May 2, 7pm".

    Output
    Output will be the shortened string, e.g., "Friday May 2".


 */

public class RemoveTheTime {

    // Method to shorten a date string to exclude the time part
    public static String shortenToDate(String longDate) {
        // Find the index of the last comma in the input string
        int lastCommaIndex = longDate.lastIndexOf(',');

        // Extract the substring from the start of the input string to just before the last comma
        String shortenedDate = longDate.substring(0, lastCommaIndex).trim();

        // Return the shortened date string without the time part
        return shortenedDate;
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test cases
        String date1 = "Friday May 2, 7pm";
        String date2 = "Saturday June 15, 9am";
        String date3 = "Wednesday April 10, 12pm";

        // Print the original dates
        System.out.println("Original dates:");
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        // Shorten the dates using the shortenToDate method
        String shortenedDate1 = shortenToDate(date1);
        String shortenedDate2 = shortenToDate(date2);
        String shortenedDate3 = shortenToDate(date3);

        // Print the shortened dates
        System.out.println("\nShortened dates:");
        System.out.println(shortenedDate1);
        System.out.println(shortenedDate2);
        System.out.println(shortenedDate3);
    }
}

/*
    public static String shortenToDate(String longDate):

    This is a public static method named shortenToDate which takes a single parameter longDate of type String. It returns a String which represents the shortened date without the time part.
    int lastCommaIndex = longDate.lastIndexOf(',');:

    lastIndexOf(',') finds the index of the last occurrence of the comma in the string longDate. This helps locate where the time information starts.
    String shortenedDate = longDate.substring(0, lastCommaIndex).trim();:

    substring(0, lastCommaIndex) extracts a substring from index 0 to lastCommaIndex - 1, effectively removing the time part (which starts right after the last comma).
    .trim() removes any leading or trailing whitespace that might result from removing the time part.
    return shortenedDate;:

    Returns the final shortened date string without the time part.
    public static void main(String[] args):

    This is the main method where test cases are defined and executed.
    Test Cases:

    Three test strings (date1, date2, date3) are defined, each representing a date with a time part.
    Printing Original Dates:

    Prints the original dates to verify the input.
    Shortening Dates:

    Calls shortenToDate for each test date to get the shortened version.
    Printing Shortened Dates:

    Prints the shortened dates to verify the output.
 */
