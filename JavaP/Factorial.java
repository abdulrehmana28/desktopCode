package javaCC.JavaP;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        
        float factorial = 1.0f;

        System.out.print("Enter number to find Factorial: ");
        float num = input.nextFloat();

        for(int i = 1; i <= num; i++){
        factorial *= i;

        System.out.print(" " + factorial);
        }

        input.close();
    }
    
}
