import java.util.Arrays;
public class AreSame {
  public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        boolean result = AreSame.comp(a, b);
        System.out.println(result);  // Output: true
    }
	
	public static boolean comp(int[] a, int[] b) {
        // Check if either array is null
        if (a == null || b == null) {
            return false;
        }

        // Check if the lengths of the arrays are different
        if (a.length != b.length) {
            return false;
        }

        // Sort both arrays in ascending order
        Arrays.sort(a);
        Arrays.sort(b);

        // Check if the square of each element in 'a' matches the corresponding element in 'b'
        for (int i = 0; i < a.length; i++) {
            if (a[i] * a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
