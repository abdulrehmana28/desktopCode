package javaCC.Final;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String playAgain;
        do {
            int randomNumber = (int) (1 + Math.random() * 1000);
            int userGuess;
            
            System.out.println("Guess a number between 1 and 1000:");

            do {
                userGuess = input.nextInt();

                if (userGuess < randomNumber) {
                    System.out.println("Too low, Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high, Try again.");
                } else {
                    System.out.println("Congratulations, You guessed the number!");
                }
            } while (userGuess != randomNumber);

            System.out.println("Do you want to play again? (yes/no)");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("yes"));

    }
}
