import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
   
        while (true){
            System.out.println("Rock, Paper or Scissors?");
            System.out.println("Break to exit game");

            String input = s.nextLine().toLowerCase();
            input = input.substring(0, 1).toUpperCase() + input.substring(1);
            String []bot = {"Rock", "Paper", "Scissors"};
    
            int randomInt = r.nextInt(3);
            String computerMove = bot[randomInt];

        if (input.equals("Break")){
            System.out.println("Exiting the game");
            s.close();
            break;
        }

        if (input.equals("Rock")){
            if (computerMove.equals("Rock")){
                System.out.println("Tie, opponent chose " + computerMove);
            } else if (computerMove.equals("Paper")){
                System.out.println("You lose, opponent chose " + computerMove);
            } else {
                System.out.println("You win! Opponent chose " + computerMove);
            }
        }

        if (input.equals("Paper")){
            if (computerMove.equals("Paper")){
                System.out.println("Tie, opponent chose " + computerMove);
            } else if (computerMove == "Scissors"){
                System.out.println("You lose, opponent chose " + computerMove);
            } else {
                System.out.println("You win! Opponent chose " + computerMove);
            }
        }

        if (input.equals("Scissors")){
            if (computerMove.equals("Scissors")){
                System.out.println("Tie, opponent chose " + computerMove);
            } else if (computerMove.equals("Rock")){
                System.out.println("You lose, opponent chose " + computerMove);
            } else {
                System.out.println("You win! Opponent chose " + computerMove);
            }
        }
    }
}
}
