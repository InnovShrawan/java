
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        boolean playAgain = true;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (playAgain) {

            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String playerChoice = scanner.nextLine().trim();

            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a Tie!");
            } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors"))
                    || (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
                    || (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock"))) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String answer = scanner.nextLine().trim();
            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }

        scanner.close();
    }
}
