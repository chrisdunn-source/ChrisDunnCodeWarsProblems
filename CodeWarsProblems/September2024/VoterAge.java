import java.util.Scanner;
 
public class VoterAge {
 
    public static void main(String[] args) {
         
        int voter_age;
        System.out.println("Enter the age: ");
         
        // Taking input from the console
         
        Scanner in = new Scanner(System.in);
        voter_age = in.nextInt();
         
        // conditional check for age criteria
        if(voter_age >= 18){
            System.out.println("Voter is eligible to vote");
        }
         
        else{
            System.out.println("Voter is not eligible to vote");
        }
          
    }
 
}
