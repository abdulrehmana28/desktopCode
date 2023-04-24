package javaCC.Assignment_1;
import java.util.Scanner;
class Q2_inft221101072 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");

        float valueInFeet = input.nextFloat();

        float valueInMeters = valueInFeet * 0.305F;

        System.out.println(valueInFeet + " feet is " + valueInMeters + " meters");

        input.close();
    }
    
}
