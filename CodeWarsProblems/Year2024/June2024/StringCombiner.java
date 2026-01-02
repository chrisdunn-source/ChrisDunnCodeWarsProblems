package June2024;
    /*
    Combine strings function
    Example:

    combineNames('James', 'Stevens')
    returns:

    'James Stevens'
     */
public class StringCombiner {
    public static void main(String[] args) {
        String fullName1 = combineNames("James", "Stevens");
        System.out.println(fullName1); // Output: James Stevens

        String fullName2 = combineNames("John", "Doe");
        System.out.println(fullName2); // Output: John Doe

        String fullName3 = combineNames("", "Smith");
        System.out.println(fullName3); // Output:  Smith

        String fullName4 = combineNames(null, "Johnson");
        System.out.println(fullName4); // Output: null Johnson

        String fullName5 = combineNames("Jane", null);
        System.out.println(fullName5); // Output: Jane null

        String fullName6 = combineNames(null, null);
        System.out.println(fullName6); // Output: null null
    }

    public static String combineNames(String first, String last) {
        return first + " " + last;
    }


}
