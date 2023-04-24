package javaCC.Assignment_1;
import java.util.Scanner;
class Q1_inft221101072{
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");

        double tempInCelsius = inputScanner.nextDouble();

        double tempInFahrenheit = (tempInCelsius * 9 / 5  )  + 32;   // ! (0°C × 9/5) + 32 = 32°F

       

        System.out.println(tempInCelsius + " Celsius is " + tempInFahrenheit + " Fahrenheit");


        inputScanner.close();

}

}