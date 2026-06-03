
/*
    Daniel Fryer
    Assignment 2.3
    4/3/2026
*/
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initate random and the scanner
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // get the computer's choice between 1 and 3
        int pcNumber = random.nextInt(3) + 1;

        // set up a variable to hold the winner
        String winner = "";
        
        // ask the user what the their choice
        System.out.print("Make your selection 1-Rock, 2-Paper, 3-Scissors: ");
        int playerNumber = input.nextInt();

        // check if the player and computer have the same choice and set the winner to tied
        if (playerNumber == pcNumber) {
            winner = "Tied";
        // check if the 3 ways the player can win and set the winner string
        } else if ((playerNumber == 1 && pcNumber == 3) || (playerNumber == 2 && pcNumber == 1) || (playerNumber == 3 && pcNumber == 2)) {  
            winner = "Player";
        }
        // if all else the computer wins
        else {
            winner = "Computer";
        }

        // Output the results of the computer and user choice and who win or a tie
        System.out.print("Computer chose: " + pcNumber + " Player chose: " + playerNumber + " Winner: " + winner);
    }
}