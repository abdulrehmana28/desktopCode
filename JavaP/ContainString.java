package javaCC.JavaP;

public class ContainString {
    public static void main(String[] args) {

        double[] myList = {23,56,3,67,12};

        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
        if (myList[i] < max) max = myList[i];
    }
        

      System.out.println(max);
    }

    
}