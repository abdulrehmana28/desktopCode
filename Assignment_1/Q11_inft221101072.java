package javaCC.Assignment_1;
import java.util.Scanner;
class Q11_inft221101072 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int sumNumber_1 = 1 + (int) (Math.random() * 100);
        int sumNumber_2 = 1 + (int) (Math.random() * 100);

        System.out.print(sumNumber_1 + " + " + sumNumber_2 + " =  " );
        int enteredNumber = inputScanner.nextInt();

        if (enteredNumber == sumNumber_1 + sumNumber_2) {
            System.out.println("Correct");
        } else {
            System.out.println("OOPs " + sumNumber_1 + " + " + sumNumber_2 + " = " + (sumNumber_1 + sumNumber_2));
        }

        inputScanner.close();

    }
}