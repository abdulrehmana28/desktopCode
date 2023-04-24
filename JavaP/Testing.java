package javaCC.JavaP;
import java.util.*;

public class Testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print(sumOfN(number));
        input.close();
      
    }// ! main
  
    public static int sumOfN(int sum) {
        if(sum == 1)
        return 1;
        else
        return sumOfN(sum - 1) + sum;
    }
    
        
} // ! class end



