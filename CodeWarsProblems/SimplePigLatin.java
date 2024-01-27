public class SimplePigLatin {
    /*
    Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    Examples
    pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
    pigIt('Hello world !');     // elloHay orldway !
     */
    public static void main(String[] args) {
        String sentence1 = "Pig latin is cool";
        String sentence2 = "Hello world !";

        String pigLatin1 = pigIt(sentence1);
        String pigLatin2 = pigIt(sentence2);

        System.out.println(pigLatin1);
        System.out.println(pigLatin2);

    }
    public static String pigIt(String str) {
        // we split the sentence into individual words. We do this by looking for spaces between the words.
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        //Go through each word one by one. For each word, we check if the first character is a letter. If it is, we take that letter off from the front of the word and add it to the end of the word. After that, we add "ay" to the end of the word. This gives us the Pig Latin version of the word. If the first character is not a letter (like a punctuation mark), we just leave the word as it is.
        for (String word : words) {
            if (Character.isLetter(word.charAt(0))) {
                String pigLatinWord = word.substring(1) + word.charAt(0) + "ay";
                //Once we have the Pig Latin version of each word, we put them all together to form a new sentence. We add spaces between the words so they don't get all jumbled up. Finally, we give back the new sentence as the result.
                result.append(pigLatinWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        //result.toString() converts the result variable, which is a StringBuilder object, into a regular String object.
        //The trim() method is then applied to this String object. The trim() method removes any leading and trailing whitespace characters from the string. Whitespace characters include spaces, tabs, and newline characters.
        //So, when we call result.toString().trim(), we are converting the StringBuilder object into a regular String object and removing any unnecessary spaces from the beginning or end of the string. Finally, this trimmed string is returned as the output of the pigIt function.
        return result.toString().trim();

    }
}
