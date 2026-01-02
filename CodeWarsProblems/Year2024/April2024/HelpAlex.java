package April2024;

public class HelpAlex {
    /**
     * The main method to test the hoopCount method.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Test cases
        int numberOfHoops1 = 5;
        String message1 = hoopCount(numberOfHoops1);
        System.out.println("Alex made " + numberOfHoops1 + " hoops. Message: " + message1);

        int numberOfHoops2 = 12;
        String message2 = hoopCount(numberOfHoops2);
        System.out.println("Alex made " + numberOfHoops2 + " hoops. Message: " + message2);

        int numberOfHoops3 = 9;
        String message3 = hoopCount(numberOfHoops3);
        System.out.println("Alex made " + numberOfHoops3 + " hoops. Message: " + message3);
    }
    /**
     * Returns an encouraging message based on the number of hoops made by Alex.
     *
     * @param n the number of hoops made by Alex
     * @return the encouraging message
     */
    public static String hoopCount(int n) {
        if (n >= 10) {
            return "Great, now move on to tricks";
        } else {
            return "Keep at it until you get it";
        }
    }


}
