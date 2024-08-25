package August2024;
/*
In this simple exercise, you will create a program that will take two lists of integers, a and b. Each list will consist of 3 positive integers above 0, representing the dimensions of cuboids a and b. You must find the difference of the cuboids' volumes regardless of which is bigger.

For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), the volume of a is 12 and the volume of b is 20. Therefore, the function should return 8.

Your function will be tested with pre-made examples as well as random ones.
 */
public class CuboidVolumes {
    public static void main(String[] args) {
        // Test case 1
        int[] firstCuboid = {2, 2, 3};
        int[] secondCuboid = {5, 4, 1};
        int difference = findDifference(firstCuboid, secondCuboid);
        System.out.println("Test case 1: " + difference); // Output: 8

        // Test case 2
        firstCuboid = new int[]{9, 7, 6};
        secondCuboid = new int[]{4, 2, 3};
        difference = findDifference(firstCuboid, secondCuboid);
        System.out.println("Test case 2: " + difference); // Output: 372

        // Test case 3
        firstCuboid = new int[]{1, 1, 1};
        secondCuboid = new int[]{1, 1, 1};
        difference = findDifference(firstCuboid, secondCuboid);
        System.out.println("Test case 3: " + difference); // Output: 0
    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        // Calculate the volume of the first cuboid
        int volumeA = calculateVolume(firstCuboid);

        // Calculate the volume of the second cuboid
        int volumeB = calculateVolume(secondCuboid);

        // Return the absolute difference between the volumes
        return Math.abs(volumeA - volumeB);
    }

    private static int calculateVolume(int[] dimensions) {
        // Multiply the three dimensions to get the volume of the cuboid
        return dimensions[0] * dimensions[1] * dimensions[2];
    }
}
