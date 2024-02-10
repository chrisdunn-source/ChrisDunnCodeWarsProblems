public class RockPaperScissors {
    /*
    Rock Paper Scissors
    Let's play! You have to return which player won! In case of a draw return Draw!.
    Examples(Input1, Input2 --> Output):
    "scissors", "paper" --> "Player 1 won!"
    "scissors", "rock" --> "Player 2 won!"
    "paper", "paper" --> "Draw!"
     */
    public static void main(String[] args) {
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("rock", "Rock"));
        System.out.println(rps("scissors", "paper"));
    }
    public static String rps(String p1, String p2) {
        //Created a varialbe string to store the result value
        String result = "";
        //created conditionals to check p1 to p2
        //used .equalsIgnoreCase because we are comparing objects and if they captilize the beginning letter we will ignore that and just check to make sure the objects match
        if (p1.equalsIgnoreCase(p2)){
            result = "Draw!";
        } else if (p1.equalsIgnoreCase("Scissors" ) && p2.equalsIgnoreCase("Paper")) {
            result = "Player 1 Won!";
        }else if (p1.equalsIgnoreCase("Scissors" ) && p2.equalsIgnoreCase("Rock")) {
            result = "Player 2 Won!";
        }else if (p1.equalsIgnoreCase("Paper" ) && p2.equalsIgnoreCase("Rock")) {
            result = "Player 1 Won!";
        }else if (p1.equalsIgnoreCase("Paper" ) && p2.equalsIgnoreCase("Scissors")) {
            result = "Player 2 Won!";
        }else if (p1.equalsIgnoreCase("Rock" ) && p2.equalsIgnoreCase("Scissors")) {
            result = "Player 1 Won!";
        }else if (p1.equalsIgnoreCase("Rock" ) && p2.equalsIgnoreCase("Paper")) {
            result = "Player 2 Won!";
        }
        //after we have checked our conditionals we will return the result
        return result;
    }
}
