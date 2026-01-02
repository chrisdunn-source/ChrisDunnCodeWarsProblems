public class AllStarCodeChallenge {
    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "Hello, how are you?";
        char targetChar = 'o';
        int occurrences = strCount(inputString, targetChar);
        System.out.println("Number of occurrences of '" + targetChar + "': " + occurrences);
    }
}
