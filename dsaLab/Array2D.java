package javaCC.dsaLab;
import java.util.*;

public class Array2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        System.out.print("Enter number of Rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of Columns: ");
        int columns = input.nextInt();

        int[][] arrData = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.println("Enter element for: " + i + " " + j + ": ");
                arrData[i][j] = input.nextInt();
            }
        }

        input.close();
        System.out.println();


        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(arrData[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
