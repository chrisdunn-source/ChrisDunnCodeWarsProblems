package May2024;

    /*
    Input: Array of elements

    ["h","o","l","a"]

    Output: String with comma delimited elements of the array in th same order.

    "h,o,l,a"

    Note: if this seems too simple for you try the next level

    Note2: the input data can be: boolean array, array of objects, array of string arrays, array of number arrays... 😕
     */
public class ArrayPointer {
    public static void main(String[] args) {
        // Test cases
        String[] stringArray = {"h", "o", "l", "a"};
        System.out.println(printArray(stringArray)); // Output: "h,o,l,a"

        Integer[] integerArray = {1, 2, 3, 4, 5};
        System.out.println(printArray(integerArray)); // Output: "1,2,3,4,5"

        Double[] doubleArray = {1.5, 2.7, 3.9};
        System.out.println(printArray(doubleArray)); // Output: "1.5,2.7,3.9"

        Boolean[] booleanArray = {true, false, true};
        System.out.println(printArray(booleanArray)); // Output: "true,false,true"
    }

    public static String printArray(Object[] array) {
        // Check if the array is null or empty
        if (array == null || array.length == 0) {
            return "";
        }

        // Create a StringBuilder object to efficiently concatenate the elements
        StringBuilder sb = new StringBuilder();

        // Iterate over the array elements
        for (int i = 0; i < array.length - 1; i++) {
            // Append the current element to the StringBuilder, followed by a comma
            sb.append(array[i].toString()).append(",");
        }

        // Append the last element of the array without a comma after it
        sb.append(array[array.length - 1]);

        // Return the final comma-delimited string representation of the array
        return sb.toString();
    }


}
