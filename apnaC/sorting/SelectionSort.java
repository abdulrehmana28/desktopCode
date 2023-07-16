package javaCC.apnaC.sorting;
public class SelectionSort {

    public static void sorting(int arr[]){

        for(int i=0; i < arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }
    
    public static void main(String[] args) {
        
        int[] arr  = {7, 8, 3, 1, 2};
        
        /* 
        selection sort

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        sorting(arr);   */
    } 
    
}
