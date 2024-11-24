public class Tortoise {
    
    public static void main(String[] args) {
        // Test cases
        int[] result1 = race(720, 850, 70);
        int[] result2 = race(80, 91, 37);

        // Print the results
        printTime(result1);
        printTime(result2);
    }

    public static int[] race(int v1, int v2, int g) {
        // Check if B's speed is not faster than A's speed
        if (v1 >= v2) {
            return null; // B cannot catch A
        }

        // Calculate total time in seconds
        int totalSeconds = (g * 3600) / (v2 - v1);

        // Convert total time to hours, minutes, and seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        return new int[]{hours, minutes, seconds};
    }

    public static void printTime(int[] time) {
        if (time == null) {
            System.out.println("B cannot catch A.");
        } else {
            System.out.printf("Time needed: %d hours, %d minutes, %d seconds\n", time[0], time[1], time[2]);
        }
    }
}
