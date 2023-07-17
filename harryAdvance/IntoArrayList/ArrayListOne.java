package javaCC.harryAdvance.IntoArrayList;

import java.util.ArrayList;

public class ArrayListOne {
    public static void main(String[] args) {
        
        ArrayList <String> cart = new ArrayList <String>();  // syntax to create an arrayList
        ArrayList <Integer> marks = new ArrayList <Integer>(2); // 2 here is initial capacity of the arrayList

        cart.add("DDR4 Ram"); // adding elements to arraylist
        cart.add("AMD Ryzen");

        marks.add(90);
        marks.add(97);

        System.out.println(cart);  // This will print the whole arraylist
        System.out.println(marks); // but can also use for loop with list.get(i) or foreach loop
    }
    
}
