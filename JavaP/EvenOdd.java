package javaCC.JavaP;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number  = input.nextInt();

        if( number % 2 == 0 ){
            System.out.print("The number is Even " + number);
        }else{
            System.out.print("The Number is Odd " + number);
        }

        input.close();
    }
    
}
