package javaCC.apnaC.Recursion;

public class NaturalSum {
    public static void main(String[] args) {
        printSum(1, 6, 0);
    }

    public static void printSum(int i, int n, int sum){

        if(i == n){
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }
    
}
