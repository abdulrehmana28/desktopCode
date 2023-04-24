package javaCC.Assignment_1;
import java.util.Scanner;

class Q8_inft221101072 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter 3 integers: ");

        int number_1 = inputScanner.nextInt();
        int number_2 = inputScanner.nextInt();
        int number_3 = inputScanner.nextInt();

        int smallestNumber = Math.min(Math.min(number_1, number_2),number_3);
        int largestNumber =  Math.max(Math.max(number_1, number_2),number_3);
        int middleNumber = (number_1 + number_2 + number_3 ) - largestNumber - smallestNumber ;

        System.out.print(smallestNumber + " " + middleNumber + " " + largestNumber);

        inputScanner.close();
    }

    
    
}
