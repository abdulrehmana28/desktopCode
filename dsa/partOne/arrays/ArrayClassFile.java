package javaCC.dsa.partOne.arrays;

public class ArrayClassFile{

    private int[] items;
    public ArrayClassFile(int length){
        items = new int [length];
    }

    public void print(){
        for(int i = 0; i < items.length; i++){
            System.out.println(items[i]);
        }
    }
}