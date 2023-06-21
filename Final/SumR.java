package javaCC.Final;

public class SumR {
    public static void main(String[] args) {
        
        
        System.out.format("The sum is %d", sumRR(3));
    }

    public static int sumRR(int n){

        if(n == 1){
            return 1;
        }
        else{
            return n + sumRR(n - 1);
        }
    }
    
}
