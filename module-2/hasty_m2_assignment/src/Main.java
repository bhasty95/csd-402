import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner scanner = new Scanner(System.in);

        // create the choices for the game
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Get computer's choice for the game
        Random random = new Random();
        int computerChoice = random.nextInt(3);

        // get user input
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:");

        int userChoice = scanner.nextInt() - 1;

        // use if statement to check if the input is valid
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid number! Please enter 1, 2, or 3.");
        } else {
            // show what the computer input is
            System.out.println("\nComputer chose: " + choices[computerChoice]);


            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }

        scanner.close();
    }

    // determine the winner
    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        } else if ((userChoice == 0 && computerChoice == 2) ||  // Rock beats Scissors
                (userChoice == 1 && computerChoice == 0) ||  // Paper beats Rock
                (userChoice == 2 && computerChoice == 1)) { // Scissors beats Paper
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}