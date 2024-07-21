package July2024;
/*
Bob needs a fast way to calculate the volume of a cuboid with three values: the length, width and height of the cuboid. Write a function to help Bob with this calculation.


 */

public class CubeVolume {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        double volume = length * width * height; // Calculate the volume by multiplying length, width, and height
        return volume; // Return the calculated volume
    }

    public static void main(String[] args) {
        // Test cases
        double volume1 = getVolumeOfCuboid(3.5, 2.8, 4.2); // Calculate volume of a cuboid with length 3.5, width 2.8, and height 4.2
        System.out.println("Volume 1: " + volume1); // Print the result

        double volume2 = getVolumeOfCuboid(5.2, 1.9, 6.7); // Calculate volume of a cuboid with length 5.2, width 1.9, and height 6.7
        System.out.println("Volume 2: " + volume2); // Print the result
    }
}
