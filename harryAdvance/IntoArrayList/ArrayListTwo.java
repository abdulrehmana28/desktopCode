package javaCC.harryAdvance.intoArrayList;

import java.util.ArrayList;

public class ArrayListTwo {
    public static void main(String[] args) {
        
        // ArrayList phones = new ArrayList(); //! can also be used but it is more general 
        ArrayList<String> phones = new ArrayList<String>(); 
        phones.add("iphone");
        phones.add("vivo");
        
        // loop one
        for (String list : phones) { // for each loop
            System.out.println(list);
        }   

        // loop two
        for(int i=0; i<phones.size(); i++) { // simple for loop
            System.out.println(phones.get(i));
        }
        System.out.println();

        //! --------------------------------------------------------------------------------
            //? how to add two arrayList into one arrayList
        ArrayList<String> applePhones = new ArrayList<String>(); // list one is iphone's
        ArrayList<String> googlePixel = new ArrayList<String>(); // list of pixels phones

        applePhones.add("iphone 11");
        applePhones.add("iphone 14");
        
        googlePixel.add("Pixel 4");
        googlePixel.add("Pixel 7");

        applePhones.addAll(googlePixel); // adding all pixels into apple list by //! .addAll(second list) method

        System.out.println(applePhones); // prints aal elements

        applePhones.clear(); //! this will clear all elements in list
    }
    
}
