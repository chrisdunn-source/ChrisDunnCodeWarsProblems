/*
Problem: Given a list of names, filter and return a list containing only the names with exactly 4 letters.
*/

import java.util.ArrayList;
import java.util.List;

class FriendFilter {
    // Method to filter the list of names and return only the names with 4 letters
    public static List<String> filterFriends(List<String> names) {
        // Create a new list to store the names of friends
        List<String> friends = new ArrayList<>();
        
        // Iterate over each name in the input list
        for (String name : names) {
            // Check if the length of the name is 4
            if (name.length() == 4) {
                // If the name has 4 letters, add it to the list of friends
                friends.add(name);
            }
        }
        
        // Return the list of friends
        return friends;
    }

    // Main method to test the friend filtering functionality
    public static void main(String[] args) {
        // Test case 1
        List<String> names1 = List.of("Ryan", "Kieran", "Jason", "Yous");
        System.out.println("Filtered friends: " + filterFriends(names1));

        // Test case 2
        List<String> names2 = List.of("Peter", "Stephen", "Joe");
        System.out.println("Filtered friends: " + filterFriends(names2));
    }
}
