public class PersonalizedMessage {
    public static void main(String[] args) {
        System.out.println(greet("Coach Dunn", "coach Dunn"));
    }
    public static String greet(String name, String owner) {
        /*
        this is a static method so you dont need a object to run this method
        is takes two string and uses an if statement to compare them. Because
        these are reference types you need to use .equals to compare.
        .equalsIgnoreCase allows you to check the value and ignore the case
         */

        if(name.equalsIgnoreCase(owner)){
            return "Hello boss";
        }
        else{
            return "Hello guest";
        }
    }
}
