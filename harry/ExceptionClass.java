package javaCC.harry;
import java.util.*;

public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try{
                // throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
    
}

class TestExceptionClass extends Exception {  //? Exception class have different methods give custom exception

    @Override
    public String toString() {
        return super.toString() + "i am a to string exception"; // if we not use super.toString() then ust string will be printed
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "I am a get Message exception";
    }
}
