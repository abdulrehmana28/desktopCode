package javaCC.harry;
import java.util.*;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        
        var input = new Scanner(System.in);
        var random = new Random();

        System.out.print("Enter 0 for Rock 1 for Paper 2 for Scissor: ");
        int userInput = input.nextInt();

        int computerInput = random.nextInt(3);

        if (userInput == computerInput){
            System.out.println("Draw!");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 
                || userInput == 2 && computerInput == 1 ){
                    System.out.println("Your win!");
                }
        else {
            System.out.println("Your loss!");
        }      
        System.out.print("Computer choice: " + computerInput);  

        input.close();
    }
}