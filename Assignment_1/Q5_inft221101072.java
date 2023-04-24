package javaCC.Assignment_1;
import java.util.Scanner;
class Q5_inft221101072 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1_Input = input.nextDouble();
        double y1_Input = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2_Input = input.nextDouble();
        double y2_Input = input.nextDouble();

        double powerOfInput_X = Math.pow((x2_Input - x1_Input), 2);
        double powerOfInput_Y = Math.pow((y2_Input - y1_Input), 2);

        double distanceFinal = Math.pow((powerOfInput_X + powerOfInput_Y), 0.5);

        System.out.print("The distance between the two points is: " + distanceFinal);


        input.close();
    }

}
