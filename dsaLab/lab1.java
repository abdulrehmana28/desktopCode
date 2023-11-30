package javaCC.dsaLab;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        fibonacci fib = new fibonacci();

        System.out.print("Enter a number: " );
        int inputNumber = input.nextInt();
         System.out.println(fib.fibonacciSeq(inputNumber) );
         System.out.print(fib.recFibonacci(inputNumber) );
        
        input.close();

    }
}

class fibonacci {

    public int fibonacciSeq(int inputNumber) {
        int term1 = 0;
        int term2 = 1;
        int newTerm = 0;

        if(inputNumber == 0 || inputNumber == 1 ){
            return inputNumber;
        }

        int count = 2;
        while(count <= inputNumber){
            newTerm = term1 + term2;
            term1 = term2;
            term2 = newTerm;
            count++;
        }
        return newTerm;
    }

    public int recFibonacci(int inputNumber) {
        if(inputNumber == 0 || inputNumber == 1) return inputNumber;
        return (recFibonacci( inputNumber -1) + recFibonacci( inputNumber -2));
    }
}
