package javaCC.harryAdvance.intoHashing;

import java.util.HashSet;

public class HashSetOne {
    public static void main(String[] args) {
        /*HashSet syntax is similar to other's like arrayList 
         * The initial default capacity of HashSet is 16 but you can give your own
         * The Hashing is very useful for searching large lists or arrays
         * It has many similar methods like arrayList
         */
        
        HashSet <Integer> hSet = new HashSet<Integer>(5, 0.5F);

        hSet.add(7); 
        hSet.add(14); 
        hSet.add(19); 
        hSet.add(2);    
        hSet.add(7); 

        System.out.println(hSet);
    }

    //! See documentation for more information
    
}
