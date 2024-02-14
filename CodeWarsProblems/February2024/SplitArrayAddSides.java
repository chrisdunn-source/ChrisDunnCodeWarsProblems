package February2024;

import java.util.Arrays;
public class SplitArrayAddSides {
    public static void main(String[] args) {
        // Test case 1
        int[] numbers1 = { 1, 2, 3, 4, 5, 6 };
        int n1 = 2;
        int[] result1 = splitAndAdd(numbers1, n1);
        System.out.println("Result 1: " + Arrays.toString(result1));
        // Expected output: [14, 10]

        // Test case 2
        int[] numbers2 = { 1, 2, 3, 4, 5, 6 };
        int n2 = 3;
        int[] result2 = splitAndAdd(numbers2, n2);
        System.out.println("Result 2: " + Arrays.toString(result2));
        // Expected output: [21, 20]

        // Test case 3
        int[] numbers3 = { 1 };
        int n3 = 5;
        int[] result3 = splitAndAdd(numbers3, n3);
        System.out.println("Result 3: " + Arrays.toString(result3));
        // Expected output: [1]

        // Test case 4
        int[] numbers4 = { 1, 2, 3 };
        int n4 = 1;
        int[] result4 = splitAndAdd(numbers4, n4);
        System.out.println("Result 4: " + Arrays.toString(result4));
        // Expected output: [4, 2]
    }
    public static int[] splitAndAdd(int[] numbers, int n) {
        if (numbers.length == 1) {
            return numbers;
        }

        for (int i = 0; i < n; i++) {
            int half = numbers.length / 2;
            int[] listA = Arrays.copyOfRange(numbers, 0, half);
            int[] listB = Arrays.copyOfRange(numbers, half, numbers.length);

            if (listA.length < listB.length) {
                int[] paddedListA = new int[listB.length];
                System.arraycopy(listA, 0, paddedListA, listB.length - listA.length, listA.length);
                listA = paddedListA;
            }

            int[] results = new int[listA.length];
            for (int j = 0; j < listA.length; j++) {
                results[j] = listA[j] + listB[j];
            }

            numbers = results;
        }

        return numbers;
    }
}
