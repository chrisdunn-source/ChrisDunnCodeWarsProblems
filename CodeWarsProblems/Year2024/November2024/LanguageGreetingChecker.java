public class LanguageGreetingChecker {
    public static boolean validateHello(String greetings) {
        String[] possibleGreetings = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
        for (String greeting : possibleGreetings) {
            if (greetings.toLowerCase().contains(greeting)) {
                return true; // Return true if the greeting is found in the input string
            }
        }
        return false; // Return false if none of the greetings are found in the input string
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(validateHello("Hello there")); // Should return true
        System.out.println(validateHello("Bonjour")); // Should return false
        System.out.println(validateHello("Czesc, jak sie masz?")); // Should return true
    }
}
