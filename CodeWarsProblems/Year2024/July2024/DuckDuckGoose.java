package July2024;
/*
Task: Given an array of Player objects (an array of associative arrays in PHP) and an index (1-based), return the name of the chosen Player(name is a property of Player objects, e.g Player.name)

Example:

duck_duck_goose([a, b, c, d], 1) should return a.name
duck_duck_goose([a, b, c, d], 5) should return a.name
duck_duck_goose([a, b, c, d], 4) should return d.name
 */
public class DuckDuckGoose {

    public static void main(String[] args) {
        // Test cases
        Player[] players = {new Player("a"), new Player("b"), new Player("c"), new Player("d")};
        System.out.println(duckDuckGoose(players, 1)); // Should print "a"
        System.out.println(duckDuckGoose(players, 5)); // Should print "a"
        System.out.println(duckDuckGoose(players, 4)); // Should print "d"
    }

    // Method to return the name of the chosen player based on the index
    public static String duckDuckGoose(Player[] players, int goose) {
        // Calculate the index of the chosen player
        int index = (goose - 1) % players.length;
        // Return the name of the chosen player
        return players[index].name;
    }
}

class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }
}