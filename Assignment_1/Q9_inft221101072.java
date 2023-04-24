package javaCC.Assignment_1;
import java.util.Scanner;

public class Q9_inft221101072 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int randomLotteryNum = 100 +(int) (Math.random() * 900); // Generate random lottery number

        System.out.print("Enter your three-digit number: ");
        int enteredUserNumber = inputScanner.nextInt();

        // Get individual digits of the lottery number and user number
        int lotteryNum_1 = randomLotteryNum / 100;
        int lotteryNum_2 = (randomLotteryNum % 100) / 10;
        int lotteryNum_3 = randomLotteryNum % 10;

        int userNum_1 = enteredUserNumber / 100;
        int userNum_2 = (enteredUserNumber % 100) / 10;
        int userNum_3 = enteredUserNumber % 10;

        System.out.println("The Lottery number is: " + randomLotteryNum);

        // Check for exact match
        if (enteredUserNumber == randomLotteryNum) {
            System.out.println("Congratulations! You win $10,000!");
        }
        // Check for all digits match
        else if (userNum_1 == lotteryNum_1 && userNum_2 == lotteryNum_2 && userNum_3 == lotteryNum_3) {
            System.out.println("Congratulations! You win $3,000!");
        }
        // Check for at least one digit match
        else if (userNum_1 == lotteryNum_1 || userNum_1 == lotteryNum_2 || userNum_1 == lotteryNum_3 ||
                 userNum_2 == lotteryNum_1 || userNum_2 == lotteryNum_2 || userNum_2 == lotteryNum_3 ||
                 userNum_3 == lotteryNum_1 || userNum_3 == lotteryNum_2 || userNum_3 == lotteryNum_3) {
            System.out.println("Congratulations! You win $1,000!");
        }
        // No match
        else {
            System.out.println("Sorry, Better Luck Next Time");
        }
        inputScanner.close();
    }
}
