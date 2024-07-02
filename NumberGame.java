import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 10;
        boolean playAgain = true;
        int roundsWon = 0;
        int totalRounds = 0;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasWon = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100. Can you guess what it is?");

            while (attempts < maxAttempts && !hasWon) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    hasWon = true;
                    roundsWon++;
                    System.out.println("Congratulations! You've guessed the correct number!");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!hasWon) {
                System.out.println("Sorry! You've used all your attempts. The correct number was: " + numberToGuess);
            }

            totalRounds++;
            System.out.println("Rounds Won: " + roundsWon + " / Total Rounds: " + totalRounds);
            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine(); // Consume the newline character
            playAgain = scanner.nextLine().equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Final Score: " + roundsWon + " rounds won out of " + totalRounds + " total rounds.");
        scanner.close();
    }
}

    

