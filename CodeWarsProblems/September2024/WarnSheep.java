package September2024;

public class WarnSheep {

    public static String warnTheSheep(String[] array) {
        // Find the position of the wolf in the array
        int wolfIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                wolfIndex = i;
                break;
            }
        }

        // Calculate the position of the sheep to be warned
        int sheepToWarn = array.length - wolfIndex - 1;

        // Check if the wolf is the closest animal
        if (wolfIndex == array.length - 1) {
            return "Pls go away and stop eating my sheep";
        } else {
            return "Oi! Sheep number " + sheepToWarn + "! You are about to be eaten by a wolf!";
        }
    }

    public static void main(String[] args) {
        // Test the method with a sample sheep queue
        String[] sheepQueue = {"sheep", "sheep", "wolf", "sheep", "sheep"};
        System.out.println(warnTheSheep(sheepQueue));
    }
}
