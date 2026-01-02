package June2024;
    /*
    Create a method that takes as input a name, city, and state to welcome a person. Note that name will be an array consisting of one or more values that should be joined together with one space between each, and the length of the name array in test cases will vary.

    Example:

    ['John', 'Smith'], 'Phoenix', 'Arizona'
    This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!
     */
public class Hello {
    public static void main(String[] args) {
        // Create an instance of the Hello class
        Hello hello = new Hello();

        // Test cases
        String[] name1 = {"John", "Smith"};
        String city1 = "Phoenix";
        String state1 = "Arizona";
        System.out.println(hello.sayHello(name1, city1, state1));

        String[] name2 = {"Jane"};
        String city2 = "New York City";
        String state2 = "New York";
        System.out.println(hello.sayHello(name2, city2, state2));

        // Add more test cases as needed

    }
    public String sayHello(String[] name, String city, String state) {
        // Join the elements of the name array into a single string
        String fullName = String.join(" ", name);

        // Formulate the welcome message
        String message = "Hello, " + fullName + "! Welcome to " + city + ", " + state + "!";

        // Return the completed message
        return message;
    }


}
