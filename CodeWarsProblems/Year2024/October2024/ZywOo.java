import java.util.regex.Pattern;

public class ZywOo {
    public static boolean validateUsr(String s) {
        // Define the regular expression pattern to validate the username
        String regex = "^[a-z0-9_]{4,16}$";
        
        // Check if the input string matches the regex pattern
        return s.matches(regex);
    }
    
    public static void main(String[] args) {
        // Test cases to validate usernames
        String username1 = "javaman_123";
        String username2 = "user";
        
        // Test the validateUsr method with the test cases
        System.out.println(username1 + " is valid: " + validateUsr(username1));
        System.out.println(username2 + " is valid: " + validateUsr(username2));
    }
}
