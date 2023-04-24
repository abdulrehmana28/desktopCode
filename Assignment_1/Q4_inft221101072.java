package javaCC.Assignment_1;
import java.util.Scanner;

class Q4_inft221101072{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the numbers of minutes: ");

        double minutesEntered = inputScanner.nextDouble();

        long  years = (long) minutesEntered / 525_600;
        float days =  (float) minutesEntered / 1_440 % 365;

        System.out.print(years + " years and " + days + " days");

        inputScanner.close();
    }
}