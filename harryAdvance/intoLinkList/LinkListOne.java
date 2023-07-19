package javaCC.harryAdvance.intoLinkList;

import java.util.LinkedList;

public class LinkListOne {
    public static void main(String[] args) {
        
        LinkedList <String> rollNumbers = new LinkedList<String>(); //! in LinkedList there is no initial capacity like ArrayList
        //? LinkedList is same as ArrayList but its internal working is different
        //? the elements are linked to each other so it is faster than ArrayList
        //? most of the methods are same but some additional methods are in LinkedList

        rollNumbers.add("inft221101064");
        rollNumbers.add("inft221101062");
        rollNumbers.add("inft221101065");   
        rollNumbers.add("inft221101061");
        rollNumbers.add("inft221101063");

        System.out.println(rollNumbers.size());
        System.out.println(rollNumbers);
        System.out.println();
        
        rollNumbers.addFirst("inft221101066");
        rollNumbers.set(3, "inft221101060");

        System.out.println(rollNumbers);
        
    }
}
