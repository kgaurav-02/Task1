import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        task1 task = new task1(); // Creating an instance of Task1 class
        task.startGame(); // Calling the non-static method startGame()
    }

    public void startGame() {
        Scanner scr = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Number Guessing Game!");
        int score = 0;
        boolean play = true;
        while (play) {
            int target = rnd.nextInt(100) + 1;
            int attempt = 0;
            int totalplay = 5;
            System.out.println("A number has been selected. Can you guess it?");
            while (attempt < totalplay) {
                System.out.println("Guess the Number:");
                int givenGuess = scr.nextInt(); // Changed Scanner to scr
                scr.nextLine();
                attempt++;
                if (givenGuess == target) {
                    System.out.println("Hooray! You guessed it right " + target + " in " + attempt + " attempts");
                    score++;
                    break;
                } else if (givenGuess < target) {
                    System.out.println("Oops! Low guess. Try again.");
                } else {
                    System.out.println("Oops! High guess. Try again.");
                }
            }
            if (attempt >= totalplay) {
                System.out.println("Oops! All attempts ended. The correct number was " + target + ".");
            }
            System.out.print("Do you want to play again? (Yes/No):");
            String playAgainInput = scr.nextLine(); // Changed Scanner to scr
            play = playAgainInput.equalsIgnoreCase("yes");
        }
        System.out.println("Game Over. Your score is " + score);
        scr.close(); // Changed Scanner to scr
    }
}
