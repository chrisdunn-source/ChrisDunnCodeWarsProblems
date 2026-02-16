package February2026;
import java.util.*;

class sorter {

    // Method to sort the list of textbooks
    public static List<String> sort(List<String> textbooks) {
        // Sort the textbooks in a case-insensitive manner
        Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
        // Return the sorted list
        return textbooks;
    }

    public static void main(String[] args) {
        // Example usage of the sort method
        List<String> textbooks = new ArrayList<>();
        textbooks.add("Mathematics");
        textbooks.add("english literature");
        textbooks.add("science fundamentals");
        textbooks.add("History");
        textbooks.add("Biology");

        // Sorting the textbooks
        List<String> sortedTextbooks = sort(textbooks);

        // Print the sorted list
        System.out.println("Sorted Textbooks: " + sortedTextbooks);
    }
}