import java.util.Random;
import java.util.Scanner;

public class rpsgame {

    public static void main(String[] args) {
        String playerMove = "";
        String computerMove = "";
        int computerInt;
        int playerWins;
        int playerLoss;
        playerWins = 0;
        playerLoss = 0;

        Scanner scan = new Scanner(System.in);
        Random generater = new Random();

        System.out.println("Hey, let's play Rock, Paper, Scissors! Please enter a move: Rock = r, Paper = p, Scissors = s, and To exit = x");

        while(!playerMove.equals("x")) {
            computerInt = 0;
            computerInt = generater.nextInt(3) + 1; // random number generator starting from 0 to 2 but adding 1 to it
            System.out.println("Enter your play: ");
            playerMove = scan.next();

            System.out.println("Computer play is: " + computerMove);

            // assigning which number is rock, paper, or scissor
            if (computerInt == 1) {
                computerMove = "R";
            }
            else if (computerInt == 2) {
                computerMove = "P";
            }
            else if (computerInt == 3) {
                computerMove = "S";
            }
            // core of the system to determine if it's a win, tie, or loss between the player and computer
            if (playerMove.equals(computerMove)){
                System.out.println("It's a tie!");
                //computerMove = "";
            }
            else if (playerMove.equals("r")) {
                if (computerMove.equals("S")) {
                    System.out.println("Rock crushes scissors. You win!!");
                    //computerMove = "";
                    playerWins += 1;
                    System.out.println("score: wins: " + playerWins + " losses:" + playerLoss);
                }
                else if (computerMove.equals("P")){
                    System.out.println("Paper eats rock. You lose!!");
                    //computerMove = "";
                    playerLoss += 1;
                    System.out.println("score: wins: " + playerWins + " losses:" + playerLoss);
                }
                else if (computerMove.equals("R")){
                    System.out.println("It's a tie!");
                    computerMove = "";
                }
            }
            else if (playerMove.equals("p")) {
                if (computerMove.equals("S")) {
                        System.out.println("Scissor cuts paper. You lose!!");
                        //computerMove = "";
                        playerLoss += 1;
                        System.out.println("score: wins: " + playerWins + " losses:" + playerLoss);
                }
                else if (computerMove.equals("R")) {
                    System.out.println("Paper eats rock. You win!!");
                    //computerMove = "";
                    playerWins += 1;
                    System.out.println("score: wins: " + playerWins + " losses:" + playerLoss);
                }
                else if (computerMove.equals("P")){
                    System.out.println("It's a tie!");
                    //computerMove = "";
                }
            }
            else if (playerMove.equals("s")) {
                if (computerMove.equals("P")) {
                    System.out.println("Scissor cuts paper. You win!!");
                    //computerMove = "";
                    playerWins += 1;
                    System.out.println("score: wins: " + playerWins + " losses:" + playerLoss);
                }
                else if (computerMove.equals("R")) {
                    System.out.println("Rock breaks scissors. You lose!!");
                    //computerMove = "";
                    playerLoss += 1;
                    System.out.println("score: wins: " + playerWins + " losses:" + playerLoss);
                }
                else if (computerMove.equals("S")){
                    System.out.println("It's a tie!");
                    //computerMove = "";
                }
            }
        }

        }

}


