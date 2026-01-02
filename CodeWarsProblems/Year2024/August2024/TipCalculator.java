public class TipCalculator {

    // Method to calculate the tip based on the bill amount and service rating
    public static Integer calculateTip(double amount, String rating) {
        // Check the service rating (case insensitive) and calculate the tip
        if (rating.equalsIgnoreCase("terrible")) {
            return (int) Math.ceil(amount * 0); // Tip 0%
        } else if (rating.equalsIgnoreCase("poor")) {
            return (int) Math.ceil(amount * 0.05); // Tip 5%
        } else if (rating.equalsIgnoreCase("good")) {
            return (int) Math.ceil(amount * 0.10); // Tip 10%
        } else if (rating.equalsIgnoreCase("great")) {
            return (int) Math.ceil(amount * 0.15); // Tip 15%
        } else if (rating.equalsIgnoreCase("excellent")) {
            return (int) Math.ceil(amount * 0.20); // Tip 20%
        } else {
            return null; // Rating not recognised
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        double billAmount = 50.0;
        String serviceRating = "Great";

        // Calculate the tip based on the bill amount and service rating
        Integer tipAmount = calculateTip(billAmount, serviceRating);

        // Display the tip amount or a message if the rating is not recognised
        if (tipAmount != null) {
            System.out.println("Tip amount: $" + tipAmount);
        } else {
            System.out.println("Rating not recognised");
        }
    }
}
