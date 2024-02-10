import java.util.List;

public class CountSmileyFaces {
    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String face : arr) {
            if (face.length() == 2) {
                if ((face.charAt(0) == ':' || face.charAt(0) == ';') && (face.charAt(1) == ')' || face.charAt(1) == 'D')) {
                    count++;
                }
            } else if (face.length() == 3) {
                if ((face.charAt(0) == ':' || face.charAt(0) == ';') && (face.charAt(1) == '-' || face.charAt(1) == '~') && (face.charAt(2) == ')' || face.charAt(2) == 'D')) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> faces1 = List.of(":)", ";(", ";}", ":-D");
        System.out.println(countSmileys(faces1)); // Output: 2

        List<String> faces2 = List.of(";D", ":-(", ":-)", ";~)");
        System.out.println(countSmileys(faces2)); // Output: 3

        List<String> faces3 = List.of(";]", ":[", ";*", ":$", ";-D");
        System.out.println(countSmileys(faces3)); // Output: 1

        List<String> faces4 = List.of();
        System.out.println(countSmileys(faces4)); // Output: 0
    }

}
