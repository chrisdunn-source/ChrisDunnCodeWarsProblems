package November2025;

public class LikeSystem {
    /*
    You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
Note: For 4 or more names, the number in "and 2 others" simply increases.
     */

    public static String displayLikes(String[] names) {
        int numLikes = names.length;

        if (numLikes == 0) {
            return "no one likes this";
        } else if (numLikes == 1) {
            return names[0] + " likes this";
        } else if (numLikes == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (numLikes == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (numLikes - 2) + " others like this";
        }
    }

    public static void main(String[] args) {
        String[] names1 = {};
        String[] names2 = {"Peter"};
        String[] names3 = {"Jacob", "Alex"};
        String[] names4 = {"Max", "John", "Mark"};
        String[] names5 = {"Alex", "Jacob", "Mark", "Max"};

        System.out.println(displayLikes(names1));
        System.out.println(displayLikes(names2));
        System.out.println(displayLikes(names3));
        System.out.println(displayLikes(names4));
        System.out.println(displayLikes(names5));
    }
}