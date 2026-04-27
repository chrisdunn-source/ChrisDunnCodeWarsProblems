package April2026;

class TriangleTester {

    // Method to check if the given side lengths can form a triangle
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        System.out.println(isTriangle(3, 4, 5));  // Expected: true, as sides can form a right-angled triangle
        System.out.println(isTriangle(1, 1, 3));  // Expected: false, as sides cannot form a triangle
        System.out.println(isTriangle(6, 8, 10)); // Expected: true, as sides can form a right-angled triangle
    }
}

