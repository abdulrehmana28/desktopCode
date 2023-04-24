package javaCC.Assignment_1;
import java.util.Scanner;
public class Q3_inft221101072 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int enteredNumber = 0;
        boolean isValid = false;
        int remainingNumber = 0;
        int sumOfNumbers = 0;

        do{
            System.out.print("Enter a number between 0 and 1000: ");
            enteredNumber = inputScanner.nextInt();
                isValid = true;
            if(enteredNumber < 0 ) {
                System.out.println("Invalid number. Try again.");
                isValid = false;
            }
        }while(isValid == false);

        while(enteredNumber > 0) {
           remainingNumber = enteredNumber % 10;
            sumOfNumbers += remainingNumber;
            enteredNumber /= 10;

        }

        System.out.println("The sum of the digits is " + sumOfNumbers);

    inputScanner.close();
}
}
