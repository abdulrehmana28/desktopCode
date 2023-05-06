package javaCC.harry;
import java.util.*;

public class TryCatch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numberArray = new int[3];
        numberArray[0] = 15;
        numberArray[1] = 30;
        numberArray[2] = 45;

        try {
            System.out.println("Enter index of array: ");              //! nested try catch
            int index = input.nextInt();
            try {
                System.out.println(numberArray[index]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("error2: " + e);
            }
        }
        catch(Exception e) {
            System.out.println("Error1: " + e);
        }
        input.close();
        
    }
   
    
}
