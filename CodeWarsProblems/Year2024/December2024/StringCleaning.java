package December2024;

class StringCleaning {
    // This method takes in a string and removes all numeric characters from it
    static String stringClean(final String text) {
        return text.replaceAll("[0-9]", ""); // Using regular expression to replace all numeric characters with an empty string
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "! !";
        String test2 = "123456789";
        String test3 = "This looks5 grea8t!";

        // Output the cleaned strings
        System.out.println(stringClean(test1)); // Expected output: "! !"
        System.out.println(stringClean(test2)); // Expected output: ""
        System.out.println(stringClean(test3)); // Expected output: "This looks great!"
    }
}

/*
In this program, the major Java concepts being used are:

Method declaration and definition
Regular expressions
String manipulation using replaceAll
main method for testing
 */