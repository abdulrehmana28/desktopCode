package javaCC.Assignment_1;
import java.util.Scanner;

class ReverseNumber {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while(number != 0){
            sum = number % 10;
            System.out.print(sum + " ");
            number  /= 10;

        }

        input.close();
    }
    
}
