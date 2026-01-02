package August2024;

public class IfFunction {
    public static void _if(Boolean bool, Runnable func1, Runnable func2) {
        // Check if the 'bool' argument is null or false (falsy values)
        if (bool == null || !bool) {
            // If 'bool' is falsy, execute the 'func2' Runnable
            func2.run();
        } else {
            // If 'bool' is truthy, execute the 'func1' Runnable
            func1.run();
        }
    }

    public static void main(String[] args) {
        // Test case 1: 'bool' is true
        System.out.println("Test case 1: 'bool' is true");
        _if(true, () -> System.out.println("true"), () -> System.out.println("false"));
        // Output: true

        // Test case 2: 'bool' is false
        System.out.println("\nTest case 2: 'bool' is false");
        _if(false, () -> System.out.println("true"), () -> System.out.println("false"));
        // Output: false

        // Test case 3: 'bool' is null
        System.out.println("\nTest case 3: 'bool' is null");
        _if(null, () -> System.out.println("true"), () -> System.out.println("false"));
        // Output: false

        // Test case 4: 'func1' and 'func2' are different
        System.out.println("\nTest case 4: 'func1' and 'func2' are different");
        _if(true, () -> System.out.println("This is func1"), () -> System.out.println("This is func2"));
        // Output: This is func1

        // Test case 5: 'func1' and 'func2' are the same
        System.out.println("\nTest case 5: 'func1' and 'func2' are the same");
        _if(false, () -> System.out.println("This is func1 and func2"), () -> System.out.println("This is func1 and func2"));
        // Output: This is func1 and func2
    }
}
