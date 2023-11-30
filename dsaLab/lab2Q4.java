package javaCC.dsaLab;

import java.util.Arrays;

public class lab2Q4 {
    public static void main(String[] args) {
        SortNames sn = new SortNames();
        String[] names = {"Ram", "John", "Anu", "Priya", "Basha", "Prem" };
        int i;
        System.out.println("Unsorted names:");
        for (i = 0; i < names.length; i++)
        System.out.println(names[i]);
        sn.sort(names);
        System.out.println("Sorted names:");
        for (i = 0; i < names.length; i++)
        System.out.println(names[i]);
        }
    
}

class SortNames {
    public void sort(String[] arr){
        Arrays.sort(arr);
    }
}
