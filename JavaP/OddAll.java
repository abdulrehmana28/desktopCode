package javaCC.JavaP;

import java.util.Scanner;

public class OddAll {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int odd = 0;

        if(number % 2 == 0){
            for(int i = 0; i <= number; i += 2){
                System.out.println(" " + i);
            }
        }
        else if(number % 2 != 0){
            for(int i = 1; i <= number; i++ ){
                
                odd++;

                if(odd % 2 != 0){
                    System.out.println(" " + odd);
                }
                else{
                    continue;
                }

            }
        }
        input.close();
    }
    
}
