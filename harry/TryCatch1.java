package javaCC.harry;


public class TryCatch1 {
    public static void main(String[] args) {
        
        int number1 = 2;
        int number2 = 0;
        float result = 0;

        try {
            result = number1 / number2;
            System.out.println("The result is " + result);  //? This is try catch use to handle exceptions
        }
        catch(Exception e) {
            System.out.println("Sorry, we can't get the result: " + e);
        }
    }
    
}
