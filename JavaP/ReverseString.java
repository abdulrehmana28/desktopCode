package javaCC.JavaP;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String lineMessage = input.nextLine();

        System.out.println(lineMessage);

        StringBuilder reverseString = new StringBuilder(lineMessage).reverse();

        System.out.println("The Reverse String is " + reverseString );


        input.close();
    }
    
}
