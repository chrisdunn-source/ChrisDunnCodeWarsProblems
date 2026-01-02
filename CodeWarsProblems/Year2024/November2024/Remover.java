public class Remover {

  // A method to remove the smallest element from an array
  public static int[] removeSmallest(int[] numbers) {
    // Check if the input array is null or has only one element
    if (numbers == null || numbers.length <= 1) {
        return new int[0]; // Return an empty array if the input is empty or has only one element
    }
    
    // Initialize variables to store the smallest element and its index
    int minValue = numbers[0];
    int minIndex = 0;
    
    // Find the index of the smallest element in the array
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] < minValue) {
            minValue = numbers[i];
            minIndex = i;
        }
    }

    // Create a new array to store the remaining elements after removing the smallest one
    int[] result = new int[numbers.length - 1];
    
    // Copy elements before the smallest element to the new array
    System.arraycopy(numbers, 0, result, 0, minIndex);
    // Copy elements after the smallest element to the new array
    System.arraycopy(numbers, minIndex + 1, result, minIndex, numbers.length - minIndex - 1);

    // Return the new array without the smallest element
    return result;
  }

  // A main method to test the removeSmallest method
  public static void main(String[] args) {
    int[] input = {5, 3, 2, 1, 4}; // Sample input array
    int[] output = removeSmallest(input); // Get the array after removing the smallest element

    // Print the elements of the output array to see the result
    for (int num : output) {
        System.out.print(num + " ");
    }
  }
}
