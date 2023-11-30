package javaCC.JavaP;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter Second Number: ");
        double secondNumber = input.nextDouble();
        input.nextLine();

        System.out.print("Enter Operator (+,-,*/): ");
        char operator = input.nextLine().charAt(0);

        switch(operator){
            case '+': System.out.println(firstNumber + secondNumber);
            break;

            case '-': System.out.println(firstNumber - secondNumber);
            break;

            case '*': System.out.println(firstNumber * secondNumber);
            break;

            case '/': System.out.println(firstNumber / secondNumber);
            break;

            default: System.out.println("Invalid operator or Number");
        }

        input.close();
    }
    
}
