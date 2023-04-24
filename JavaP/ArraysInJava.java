package javaCC.JavaP;


import java.util.Arrays;
public class ArraysInJava{
    public static void main(String[] args){

        int userAge[] = {56,12,15,50};

        int[] myMarks = {25,67,90};

       // int[] sum = new int[10]; 

        int[] testArray;

        testArray = new int[] {78,45,34};

        testArray[0] -= 12;

        boolean equalsOrNot = Arrays.equals(userAge, myMarks);  // Arrys is a static class we have to call it by name Arrays.(method name)

        System.out.println(testArray[0]);
        System.out.println(equalsOrNot);
        //System.out.println(Arrays.toString(myMarks));
        Arrays.sort(userAge);
        System.out.println(Arrays.toString(userAge));

    }
}