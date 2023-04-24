package javaCC.Assignment_1;
import java.util.Scanner;

public class Q10_inft221101072 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter your three-digit Integer: ");
        int enteredNumber = inputScanner.nextInt();

        int enteredNum_1 = enteredNumber / 100;
        //int enteredNum_2 = (enteredNumber % 100) / 10;
        int enteredNum_3 = enteredNumber % 10;

        if(enteredNum_1 == enteredNum_3) {

        System.out.println(enteredNumber + " is a palindrome");
        }
        else {
            System.out.println(enteredNumber + " is not a palindrome");
        }

        inputScanner.close();

    }
}