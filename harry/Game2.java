package javaCC.harry;
import java.util.Random;
import java.util.Scanner;

public class Game2 {
    private int randomNumber;
    private int noOfGuesses;

    public Game2() {
        Random random = new Random();
        this.randomNumber = random.nextInt(100) + 1; // generate a random number between 1 and 100
        this.noOfGuesses = 0;
    }

    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number between 1 and 100: ");
        int userNumber = scanner.nextInt();
        this.noOfGuesses++;
        
        if (isCorrectNumber(userNumber)) {
            System.out.println("Congratulations! You guessed the correct number in " + this.noOfGuesses + " guesses.");
        } else if (userNumber > this.randomNumber){
            System.out.println("Incorrect! less then guess.");
            takeUserInput();
        }
        else if (userNumber < this.randomNumber){
            System.out.println("Incorrect! more then guess.");
            takeUserInput();
        }
        scanner.close();
    }

    public boolean isCorrectNumber(int userNumber) {
        return userNumber == this.randomNumber;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public static void main(String[] args) {
        var game = new Game2();
        game.takeUserInput();
    }
}
