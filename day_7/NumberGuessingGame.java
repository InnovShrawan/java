
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 5;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + attempts + " attempts.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Correct! You Win!");
                guessedCorrectly = true;
                break;
            } else if (guess > numberToGuess) {
                System.out.println("Too High!");
            } else {
                System.out.println("Too Low!");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Game Over! The number was " + numberToGuess);
        }

        scanner.close();
    }
}
