package June2024;
import java.util.HashMap;
import java.util.Map;

    /*
    Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries. Marketing thinks it would be great to welcome visitors to the site in their own language. Luckily you already use an API that detects the user's location, so this is an easy win.

    The Task
    Think of a way to store the languages as a database. The languages are listed below so you can copy and paste!
    Write a 'welcome' function that takes a parameter 'language', with a type String, and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.
    The Database
    [ ("english", "Welcome")
    , ("czech", "Vitejte")
    , ("danish", "Velkomst")
    , ("dutch", "Welkom")
    , ("estonian", "Tere tulemast")
    , ("finnish", "Tervetuloa")
    , ("flemish", "Welgekomen")
    , ("french", "Bienvenue")
    , ("german", "Willkommen")
    , ("irish", "Failte")
    , ("italian", "Benvenuto")
    , ("latvian", "Gaidits")
    , ("lithuanian", "Laukiamas")
    , ("polish", "Witamy")
    , ("spanish", "Bienvenido")
    , ("swedish", "Valkommen")
    , ("welsh", "Croeso")
    ]
    Possible invalid inputs include:

    IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
    IP_ADDRESS_NOT_FOUND - ip address not in the database
    IP_ADDRESS_REQUIRED - no ip address was supplied
     */

public class LanguageDatabase {
    // Create a map to store language greetings
    private static final Map<String, String> languageDatabase = new HashMap<>();

    static {
        // Populate the languageDatabase map with key-value pairs of languages and greetings
        languageDatabase.put("english", "Welcome");
        languageDatabase.put("czech", "Vitejte");
        languageDatabase.put("danish", "Velkomst");
        languageDatabase.put("dutch", "Welkom");
        languageDatabase.put("estonian", "Tere tulemast");
        languageDatabase.put("finnish", "Tervetuloa");
        languageDatabase.put("flemish", "Welgekomen");
        languageDatabase.put("french", "Bienvenue");
        languageDatabase.put("german", "Willkommen");
        languageDatabase.put("irish", "Failte");
        languageDatabase.put("italian", "Benvenuto");
        languageDatabase.put("latvian", "Gaidits");
        languageDatabase.put("lithuanian", "Laukiamas");
        languageDatabase.put("polish", "Witamy");
        languageDatabase.put("spanish", "Bienvenido");
        languageDatabase.put("swedish", "Valkommen");
        languageDatabase.put("welsh", "Croeso");
    }

    // Method to return the appropriate greeting based on the language provided
    public static String greet(String language) {
        // Retrieve the greeting from the languageDatabase map based on the provided language
        String greeting = languageDatabase.get(language.toLowerCase());

        // Check if a greeting was found for the given language
        if (greeting != null) {
            return greeting; // Return the greeting if found
        } else {
            return "Welcome"; // Default to English if language is not found
        }
    }

    // Main method to test the greet method
    public static void main(String[] args) {
        // Array of test languages
        String[] testLanguages = {
                "english",
                "german",
                "french",
                "japanese",
                "spanish"
        };

        // Iterate over the testLanguages array
        for (String language : testLanguages) {
            // Call the greet method for each language and print the language and greeting
            String greeting = greet(language);
            System.out.println("Language: " + language + ", Greeting: " + greeting);
        }
    }
}